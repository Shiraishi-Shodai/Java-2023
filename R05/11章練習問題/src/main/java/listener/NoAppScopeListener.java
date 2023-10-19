package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Listener
 *
 */
@WebListener
public class NoAppScopeListener implements ServletContextAttributeListener{

    /**
     * Default constructor. 
     */
    public NoAppScopeListener() {
        // TODO Auto-generated constructor stub
    }
//アプリケーションスコープにインスタンスを保存
@Override
public void attributeAdded(ServletContextAttributeEvent event) {
	System.out.println("error!");
}
//アプリケーションスコープにインスタンスを削除
@Override
public void attributeRemoved(ServletContextAttributeEvent event) {
	
}

//アプリケーションスコープにインスタンスを上書き
@Override
public void attributeReplaced(ServletContextAttributeEvent event) {
	
}
	
}
