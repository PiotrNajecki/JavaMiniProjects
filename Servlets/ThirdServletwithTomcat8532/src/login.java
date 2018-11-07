import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;

public class login extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n=request.getParameter("userName");
		String p=request.getParameter("userPass");
		
		if(p.equals("servlet")) {
			RequestDispatcher rd = (RequestDispatcher) request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
			
		} else {
			out.print("Sorry UserName or Password incorrect");
			RequestDispatcher rd = (RequestDispatcher) request.getRequestDispatcher("/index.html");
			rd.include(request, response);
			
		}
		
		
	}
	

}
