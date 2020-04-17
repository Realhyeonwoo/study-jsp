package project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class Calc extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html); charset=UTF-8");
		
		int num1 = 0, num2 = 0;
		if(req.getParameter("x") != null || !req.getParameter("x").equals("")) {
			num1 = Integer.parseInt(req.getParameter("x"));
		}
		if(req.getParameter("y") != null || !req.getParameter("y").equals("")) {
			num2 = Integer.parseInt(req.getParameter("y"));
		}
		
		String op = req.getParameter("operator");
		
		PrintWriter out = res.getWriter();
		
		if(op.equals("덧셈")) {
			out.println(op);
			out.println("두 개의 합: " + (num1+num2));			
		} else {
			out.println(op);
			out.println("두 개의 합: " + (num1-num2));						
		}
	}

}
