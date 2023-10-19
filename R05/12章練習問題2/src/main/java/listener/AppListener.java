package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import ex.Fruit;

/**
 * Application Lifecycle Listener implementation class AppListener
 *
 */
@WebListener
public class AppListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public AppListener() {
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
    	ServletContext context = sce.getServletContext();
    	Fruit fruit = new Fruit("いちご",1000);
    	context.setAttribute("fruit", fruit);
    }
	
}
