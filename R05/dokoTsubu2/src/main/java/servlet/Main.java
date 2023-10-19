package servlet;

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
		//main.jspにフォワード
		RequestDispatcher  dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエストパラメータをエンコーディング
				request.setCharacterEncoding("UTF-8");
				
				//パラメータを取得
				String text = request.getParameter("text");
				//セッションスコープを取得
				HttpSession session = request.getSession();
				//セッションスコープからuserを取得
				User user = (User)session.getAttribute("user");
				//ユーザーと内容を記憶するmutterを生成
				Mutter mutter = new Mutter(user,text);
				
				//アプリケーションスコープを取得
				ServletContext application = this.getServletContext();
				//アプリケーションからリストを取得
				List<Mutter> list = (List<Mutter>)application.getAttribute("list");
				//もしlistがnullならリストを生成
				if(list == null) {
					list = new ArrayList<Mutter>();
				}
				//textが空の時、エラーメッセージを用意
				String error = null;
				if(text.equals("")) {
					error = "つぶやきが入力されていません";
					request.setAttribute("error", error);
				}else {
					//リストにmutterを格納
					list.add(mutter);
					//アプリケーションスコープにlistをセット
					application.setAttribute("list", list);
				}
				

				//main.jspにフォワード
				RequestDispatcher  dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
				dispatcher.forward(request, response);
	}

}
