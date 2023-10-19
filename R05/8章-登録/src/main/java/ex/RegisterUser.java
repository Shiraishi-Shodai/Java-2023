package ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		System.out.println(action);

		if(action == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/index.jsp");
			dispatcher.forward(request, response);
			
		}else if(action.equals("put")) {
//			System.out.println("通過しました");
			RegisterUserLogic logic = new RegisterUserLogic();
			logic.put();
			response.sendRedirect("touroku.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		
		User u = new User(id, pass, name);
		HttpSession session = request.getSession();
		session.setAttribute("u", u);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/check.jsp");
		dispatcher.forward(request, response);
	}

}
