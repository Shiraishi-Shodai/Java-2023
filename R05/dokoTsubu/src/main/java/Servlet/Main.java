package Servlet;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Error;
import model.Mutter;
import model.User;
/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		//updateパラメータが渡されたらMain.jspにリダイレクトする
		if(action != null) {
			response.sendRedirect("Main.jsp");
		}
		//アプリケーションスコープを用意
		ServletContext application = getServletContext();
		//アプリケーションスコープのmutterインスタンスを取得
		List<Mutter> mutterList = (List<Mutter>)application.getAttribute("mutter");
		
		//mutterインスタンスが存在しなければ
		if(mutterList == null) {
			//リストを生成
			mutterList = new ArrayList<Mutter>();
			//アプリケーションスコープにmutterListを格納
			application.setAttribute("mutterList", mutterList);
		}
		
		//セッションスコープのユーザーを取得
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		//ログインしていなければ、トップにリダイレクトする
		if(user == null) {
			response.sendRedirect("index.jsp");
		}else {
			RequestDispatcher  dispatcher = request.getRequestDispatcher("Main.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//つぶやき内容を取得
		String text = request.getParameter("mutter");
		//mutterが空文字の時、Main.jspにフォワードする
		if(!text.isEmpty() && text != null) {
			//アプリケーションスコープを用意
			ServletContext application = getServletContext();
			//アプリケーションスコープのmutterインスタンスを取得
			List<Mutter> mutterList = (List<Mutter>)application.getAttribute("mutterList");
			//セッションスコープのユーザーを取得
			HttpSession session = request.getSession();
			User user = (User)session.getAttribute("user");
			//Mutterインスタンスを生成
			Mutter mutter = new Mutter(user.getName(),text);
			//mutterListの先頭にmutterを格納
			mutterList.add(0,mutter);
			application.setAttribute("mutterList", mutterList);
		}else {
			Error e = new Error();
			e.setError("つぶやきが入力されていません");
			request.setAttribute("error", e);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("Main.jsp");
	    dispatcher.forward(request, response);
	
	}

}
