import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayImage extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
	response.setContentType("image/jpeg");
//	ServletOutputStream out = response.getOutputStream();
//	FileInputStream fin = new FileInputStream("D:\\piotrek.jpg");
	
	File imageFile = new File("D:\\piotrek.jpg");
	PrintWriter outWriter = response.getWriter();
	
//	BufferedInputStream bin = new BufferedInputStream(fin);
//	BufferedOutputStream bout = new BufferedOutputStream(out);
	String d= imageFile.getAbsolutePath();
	
	
//	int ch=bin.read();
	
	outWriter.print("'<img src="+d+">'");
	outWriter.
//	
//	while(ch!=-1) {
//		//bout.write(ch);
//	}
//	
//	bin.close();
//	fin.close();
//	
//	bout.close();
//	out.close();
	
	}
	
	
	
	
	

}
