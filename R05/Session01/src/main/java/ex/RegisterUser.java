package ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String path = null;
	  String action = request.getParameter("action");
	  if(action == null) {
		  path = "/WEB-INF/jsp/registerForm.jsp";
	  }else if(action.equals("done")) {
		//セッションインスタンスを生成
		  HttpSession session = request.getSession();
		  User user = (User)session.getAttribute("user");
		  RegisterUserLogic logic = new RegisterUserLogic();
		  logic.excute(user);
		  //不要になったUserインスタンスを削除
		  session.removeAttribute("user");
		  path = "/WEB-INF/jsp/registerDone.jsp";
	  }
	  //pathにフォワード
    RequestDispatcher dispatcher = request.getRequestDispatcher(path);
    dispatcher.forward(request, response);
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  request.setCharacterEncoding("UTF-8");
	  //入力されたデータを取得
	  String id = request.getParameter("login");
	  String pass = request.getParameter("pass");
	  String name = request.getParameter("name");
	  //Userインスタンスを生成
	  User user = new User(id,pass,name);
	  //セッションインスタンスを生成
	  HttpSession session = request.getSession();
	  //セッションスコープにuserを格納
	  session.setAttribute("user", user);
	  //Done.jspにリダイレクト
	  response.sendRedirect("registerConfirm.jsp");
  }
}