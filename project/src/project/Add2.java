package project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add2")
public class Add2 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html); charset=UTF-8");
		
		String[] num = req.getParameterValues("num"); 
			
		int result = 0;
		for(String n : num) {
			result += Integer.parseInt(n);
		}
		
//		PrintWriter out = res.getWriter();
		
		res.getWriter().printf("result is %d\n", result);
	}

}
