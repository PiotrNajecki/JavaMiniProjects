

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;



public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("userpass");
		
		if (LoginDao.validate(username, password)) {
			@SuppressWarnings("deprecation")
			RequestDispatcher rd = (RequestDispatcher) request.getRequestDispatcher("2servlet");
			rd.forward(request, response);
		} else {
			out.print("Sorry, username or password is incorrect");
			RequestDispatcher rd = (RequestDispatcher) request.getRequestDispatcher("index.html");
			rd.include(request,response);
		}
		
		out.close();
	}

}
