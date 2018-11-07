import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminServlet extends HttpServlet {

	
//	public void doGet(ServletRequest request, ServletResponse response)
//			throws IOException, ServletException {
//		response.getWriter();
//		PrintWriter out = response.getWriter();
//		out.print("welcome ADMIN");
//		out.close();
//		
//	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.getWriter();
		PrintWriter out = response.getWriter();
		out.print("welcome ADMIN");
		out.close();
		
	}
	
//	protected void service(HttpServletRequest request, HttpServletResponse   response) throws ServletException, IOException {
//        doPost(request, response);
//}

	

}
