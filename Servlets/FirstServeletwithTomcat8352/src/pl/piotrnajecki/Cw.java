package pl.piotrnajecki;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

public class Cw extends HttpServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		HttpServletRequest request;
		HttpServletResponse response;
		
		try {
			request = (HttpServletRequest) req;
			response = (HttpServletResponse)res;
			
		} catch (ClassCastException e) {
			throw new ServletException("non-HTTP request or response");
		}
		service(request, response);
		
	}
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		{
			String method = req.getMethod();
			if(method.equals("GET")) {
				long lastModified = getLastModified(req);
				if(lastModified == -1L) {
					doGet(req, resp);
				} else if (method.equals("POST")) {
					if (lastModigied == 1L) {
						doPost(req, resp);
					}
					
				}
				
			}
			
			
				
			}
			
		}
		

	

}
