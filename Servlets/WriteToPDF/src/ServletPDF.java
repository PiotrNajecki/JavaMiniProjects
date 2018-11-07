

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.darwinsys.spdf.PDF;  

public class ServletPDF extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("application/pdf");
		
		response.setHeader("Content-disposition","inline; filename='javatpoint.pdf'");
		PDF p = new PDF(out);
		Page p1 = new Page(p);
		p1.add(new MoveTo(p, 200, 700));
		p1.add(new Text(p, "www.piotrnajecki.pl"));
		p1.add(new Text(p, "by somebody"));
		
		p.add(p1);
		p.setAuthor("Piotr N.");
		p.writePDF();
	}
}
