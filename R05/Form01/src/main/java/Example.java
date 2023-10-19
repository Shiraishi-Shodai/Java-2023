

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class example
 */
@WebServlet("/Example")
public class Example extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Example() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		//HTMLはsetContentTypeで指定して文字コードで出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		//文字コードを訂正
		request.setCharacterEncoding("UTF-8");
		//リクエストパラメータを取得
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		
		out.print(name);
		out.print(gender);
		
		String message = "";
		//もし名前と性別の両方を入力していれば登録完了。そうでなければ登録失敗
		if(name == null || name.length() == 0) {
			message = "名前が入力されていません";
		}else if(gender == null || gender.length() == 0) {
			message = "性別が入力されていません";
		}
		
		String msg = "名前" + name + "," + "性別" + gender + "を登録しました";
		if(!message.equals("")) {
			msg = message;
		}
		
		out.print("<p>" + msg + "</p>");
		
		
	}

}
