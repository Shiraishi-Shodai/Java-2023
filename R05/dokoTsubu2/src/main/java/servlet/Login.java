package servlet;

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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエストパラメータをエンコーディング
		request.setCharacterEncoding("UTF-8");
		
		//パラメータを取得
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		//Userインスタンスを生成
		User user = new User(name,password);
		//LoginLogicインスタンスを生成
		LoginLogic logic = new LoginLogic();
		//ログイン可否判定(trueならログイン可能、falseなら不可能)
		if(logic.excute(user)) {
			//セッションスコープを取得
			HttpSession session = request.getSession();
			//セッションスコープにuserをセット
			session.setAttribute("user", user);
		}
		
		//ログイン成功・失敗画面へフォワード
		RequestDispatcher  dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		dispatcher.forward(request, response);
		
	}

}
