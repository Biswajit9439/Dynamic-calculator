package com.quizapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class quizapp_servlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		
		String fst = request.getParameter("first");
		String lst = request.getParameter("last");
		String operator = request.getParameter("opr");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		double f=Double.parseDouble(fst);
		double l=Double.parseDouble(lst);
		double result=0;
		
		if(operator.equals("+")){
			result=f+l;
			out.println("<h1 style=text-align:center> <span style=color:red> Result="+result+"</span></h1>");
		}
		else if(operator.equals("-"))
		{
			result=f-l;
			out.println("<h1 style=text-align:center> <span style=color:red> Result="+result+"</span></h1>");
		}
		else if(operator.equals("*"))
		{
			result=f*l;
			out.println("<h1 style=text-align:center> <span style=color:red> Result="+result+"</span></h1>");
		}
		else if(operator.equals("/"))
		{
			result=f/l;
			out.println("<h1 style=text-align:center> <span style=color:red> Result="+result+"</span></h1>");
		}
		else
		{
			
			out.println("<h2>Invalid operator</h2>");
		}
		
		
		
	}
	

}
