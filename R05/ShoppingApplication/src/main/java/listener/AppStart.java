package listener;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import Beans.Cart;
import Beans.Products;
/**
 * Application Lifecycle Listener implementation class AppStart
 *
 */
@WebListener
public class AppStart implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public AppStart() {
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
//    	アプリケーションスコープを用意
    	ServletContext context = sce.getServletContext();
//    	プロダクトインスタンスを生成し、Cartインスタンスに代入
    	Products pen = new Products ("pen", 100);
    	Products bag = new Products ("bag",10000);
    	Products computer = new Products ("computer",100000);
    	
    	Cart cart = new Cart();
    	Map<String,Products> productsMap = cart.getProductsMap();
    	
    	productsMap.put(pen.getName(),pen);
    	productsMap.put(bag.getName(),bag);
    	productsMap.put(computer.getName(),computer);
    	cart.setProductsMap(productsMap);
    	
    	productsMap = cart.getProductsMap();
    	
//    	生成したcartをアプリケーションスコープに代入
    	context.setAttribute("cart", cart);
    	
    }
	
}
