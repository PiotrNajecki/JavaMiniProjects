package pl.piotrnajecki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class First implements Servlet {
	ServletConfig config = null;
	
	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("Server is initialized");
		
	}

	@Override
	public void destroy() {
		System.out.println("servlet is destroyed");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "copyright 2007-1010";
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello simple servlet</b>");
		out.print("</body></html>");
		
	}

}
