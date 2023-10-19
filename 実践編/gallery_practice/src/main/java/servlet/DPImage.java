package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DPImage
 */
@WebServlet("/DPImage")
public class DPImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DPImage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		PreparedStatement pStmt = null;
		try {
//			Driverをセット
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("ドライバエラー");
		}
		
//		DBに接続
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/gallery", "gallery", "password");
			String sqp = "SELECT * FROM PHOTOS"
		}
//		リクエストパラメータからidを受け取る
		String id = request.getParameter("id");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
