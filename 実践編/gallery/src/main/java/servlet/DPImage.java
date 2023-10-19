package servlet;

import java.io.IOException;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
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
		// TODO Auto-generated method stub
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mariadb://localhost/gallery", "gallery", "password");
            stmt = conn.createStatement();
            String sql = "SELECT * FROM `photos` WHERE `id` = '" + request.getParameter("id") + "'";
            ResultSet hrs = stmt.executeQuery(sql);
//            HTTPレスポンスにバイナリデータを書き込むための型を用意
            ServletOutputStream ops = response.getOutputStream();
//            一行進めて最初のデータを取り出す
            hrs.next();

            String fnm = hrs.getString("file");
            //MIME Type
//            データベースから取り出したファイルの拡張子からコンテントタイプを指定
            response.setContentType(URLConnection.guessContentTypeFromName(fnm));
            //ダウンロード時にはファイル名にデータベースに保存しているファイル名を指定
            response.setHeader("Content-Disposition", "Filename=" + fnm );

            ops.write(hrs.getBytes("image"));

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {} // do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            } //end finally try
        } //end try
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
