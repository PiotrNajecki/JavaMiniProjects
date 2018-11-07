

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		response.setContentType("text/html");
		request.getRequestDispatcher("link.html").include(request, response);
		HttpSession session = request.getSession(false);
		PrintWriter out = response.getWriter();
		
		if (session!=null) {
			String name = (String) session.getAttribute("name");
			out.print("Hello, "+name+" Welcom to Profile");
			
		} else {
			out.print("Please login first");
			request.getRequestDispatcher("login.html").include(request, response);
			
		}
	out.close();
		
		
	}

}
