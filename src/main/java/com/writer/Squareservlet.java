package com.writer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Squareservlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int number4=(int) req.getAttribute("number4value");
		
		PrintWriter out= res.getWriter();
		
		out.println("Square of that value : "+number4);
		
	}

}
