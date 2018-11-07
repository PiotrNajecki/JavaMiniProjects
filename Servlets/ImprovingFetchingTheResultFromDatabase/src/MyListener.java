

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.jasper.tagplugins.jstl.core.Out;


public class MyListener implements ServletContextListener {

   
	 public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("Project Undeployed...");
    }
	
	
    public void contextInitialized(ServletContextEvent e)  { 
         ArrayList<User> list = new ArrayList<User>();
         try {
        	 Class.forName("oracle.jdbc.driver.OracleDriver");
        	 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
        	 
        	 PreparedStatement ps = con.prepareStatement("select * from csuser");
        	 ResultSet rs = ps.executeQuery();
        	 
        	 while (rs.next()) {
        		 User user = new User();
        		 user.setId(rs.getInt(1));
        		 user.setName(rs.getString(2));
        		 user.setPassword(rs.getString(3));
        		 list.add(user);        		 
        	 }
        	     con.close();
        	 
        	 
         } catch (Exception ex) {
         	ex.printStackTrace();}
         
         // storing the ArrayList object in ServletContext
         ServletContext context = e.getServletContext();
         context.setAttribute("data", list);
         
    }
	
}
