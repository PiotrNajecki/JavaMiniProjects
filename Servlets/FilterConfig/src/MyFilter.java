

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;



public class MyFilter implements Filter {
	FilterConfig config;
	
  
	public void destroy() {
	
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		String s = config.getInitParameter("construction");
		
		if (s.equals("yes")) {
			out.print("The page is underconstruction");
		} else {
			chain.doFilter(request, response);
			
		}
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
