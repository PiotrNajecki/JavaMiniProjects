

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletContext context = getServletContext();
		ArrayList list = (ArrayList) context.getAttribute("data");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			User u = (User) itr.next();
			out.print("Id: "+u.getId()+" Imie: "+u.getName()+ " Haslo: "+u.getPassword());
			
		}
		
		out.close();
		
		
		
		
	}

}
