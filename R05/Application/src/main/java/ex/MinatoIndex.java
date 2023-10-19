package ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MinatoIndex
 */
@WebServlet("/MinatoIndex")
public class MinatoIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MinatoIndex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//アプリケーションスコープの用意
		ServletContext application = getServletContext();
		//SiteEVを生成
		SiteEV site = (SiteEV)application.getAttribute("site");
		//アプリケーションスコープにSiteEVインスタンスが格納されていなければ、SiteEVをnewする。
		if(site==null) {
			site = new SiteEV();
		}
		//リクエストのエンコード
		request.setCharacterEncoding("UTF-8");
		//actionリクエストパラメータを取得
		String action = request.getParameter("action");
		//actionがnullでないとき
		if(action != null) {
			//SiteEVLogicインスタンスを生成
			SiteEVLogic logic = new SiteEVLogic();
			//いいね、よくないねカウントを増やす
			logic.excute(site,action);
		}
		//アプリケーションスコープにsiteを格納
		application.setAttribute("site", site);
		//minatoIndexにフォワード
		RequestDispatcher  dispatcher = request.getRequestDispatcher("/WEB-INF/minatoIndex.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
