package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class InAppListener
 *
 */
@WebListener
public class InAppListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public InAppListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	//アプリケーション開始時にカウンターインスタンスを初期化
    	ServletContext app = sce.getServletContext();
    	//カウンターインスタンス
    	Integer counter = 0;
    	app.setAttribute("counter", counter);
    }
	
}
