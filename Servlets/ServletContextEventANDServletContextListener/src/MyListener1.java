

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyListener1
 *
 */
@WebListener
public class MyListener1 implements ServletContextListener, ServletContextAttributeListener {

    
    public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("project undeployed");
    }

	
 
    public void contextInitialized(ServletContextEvent arg0)  { 
         try {
        	 Class.forName("oracle.jdbc.driver.OracleDirver");
        	 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
        	 
        	 String query="create table emp32(id number(10), name varchar2(40))";
        	 PreparedStatement ps = con.prepareStatement(query);
        	 ps.executeUpdate();
        	 System.out.println(query);
        	 
        	 
        	 
         } catch (Exception e) {
        	 e.printStackTrace();
         }
    }
	
}
