package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Test3 implements ServletRequestListener {

	public void requestInitialized(ServletRequestEvent sre)  { 
        // TODO Auto-generated method stub
        System.out.println("for request Initialisation");
	}

	public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
         System.out.println("for request Destroy");
	}
}
