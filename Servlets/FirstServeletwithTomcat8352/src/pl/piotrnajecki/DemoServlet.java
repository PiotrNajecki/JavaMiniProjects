package pl.piotrnajecki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");  // setting the content type
		PrintWriter out = res.getWriter(); // get the stream to write data
		out.print("<html> <body>");
		out.print("<b>Nowy Servlet</b>");
		out.print("</html> </body>");
		out.close();  // closing the stream
	}

}
