package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;
import model.HealthCheckLogic;

/**
 * Servlet implementation class HealthCheck
 */
@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/healthCheck.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTf-8");
		String h = request.getParameter("height");
		String w = request.getParameter("weight");
		
		double height = Double.parseDouble(h);
		double weight = Double.parseDouble(w);
		
		Health health = new Health(height, weight);
		
		HealthCheckLogic logic = new HealthCheckLogic();
		logic.judge(health);
		request.setAttribute("health", health);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/healthCheckResult.jsp");
		dispatcher.forward(request, response);
		

	}

}
