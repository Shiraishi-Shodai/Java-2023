

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class db
 */
@WebServlet("/db")
public class db extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public db() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/form.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name  = request.getParameter("name");
		String p  = request.getParameter("price");
		String inv  = request.getParameter("inventory");
		
		int price = Integer.parseInt(p);
		int inventory = Integer.parseInt(inv);
		
		System.out.println(name);
		System.out.println(price);
		System.out.println(inventory);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("ドライバーエラー");
		}
		
		try(Connection conn = DriverManager.getConnection("jdbc:mySQL://localhost/dao_practice01","root", "pathSQL")){
			System.out.println("ここまでOK");
			String sql = "insert into commodity(id, name, price, inventory) values(?, ?, ?, ?) ";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			pStmt.setInt(1, 1);
			pStmt.setString(2, name);
			pStmt.setInt(3, price);
			pStmt.setInt(4, inventory);
			
			int i = pStmt.executeUpdate();
			
			System.out.println(i);
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/a.jsp");
			dispatcher.forward(request, response);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
