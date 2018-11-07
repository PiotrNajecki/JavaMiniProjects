import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("userName");
		String password = request.getParameter("userPass");
		String emailId = request.getParameter("userEmail");
		String country = request.getParameter("userCountry");
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			PreparedStatement ps = con.prepareStatement("insert into registeruser values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, emailId);
			ps.setString(4, country);
		
			
			int i = ps.executeUpdate();
			if (i>0) {
				out.print("You are successfully registered...");
			} else {
				out.print("You are not registered. There is an error.");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.close();
		
	}

}
