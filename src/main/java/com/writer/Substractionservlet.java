package com.writer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Substractionservlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	
	String a=req.getParameter("num1");
	String b=req.getParameter("num2");
	
	int number1=Integer.parseInt(a);
	int number2=Integer.parseInt(b);
	int number3=number1-number2;
	int number4=number3*number3;
	
	PrintWriter out= res.getWriter();
	out.println("Difference is : "+number3);
	
	req.setAttribute("number4value", number4);
	
	RequestDispatcher rd=req.getRequestDispatcher("/square");
	rd.forward(req, res);
	

	}
}
