package Servlet;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;
/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher  dispatcher = request.getRequestDispatcher("/WEB-INF/logOut.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエストをエンコード
		request.setCharacterEncoding("UTF-8");
		//パラメータを取得
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		User user = new User(name,password);
		//ログイン可否を判断するLoginLogicインスタンスを生成
		LoginLogic logic = new LoginLogic();
		boolean flag = logic.execute(user);
		//ログインが可能ならば、セッションスコープにユーザーを格納する
		if(flag) {
			//セッションインスタンスを生成
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
		}

		RequestDispatcher  dispatcher = request.getRequestDispatcher("/WEB-INF/loginResult.jsp");
		dispatcher.forward(request, response);
	}

}
