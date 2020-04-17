package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studyGet")
public class studyGet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		
		String temp = req.getParameter("cnt");
		int cnt = 0;
		if(temp != null && !temp.equals("")) cnt = Integer.parseInt(temp);

		for(int i=0; i<cnt; i++)
			out.println((i+1) + ": 안녕 Servlet!!<br>");
		
	}
	
}