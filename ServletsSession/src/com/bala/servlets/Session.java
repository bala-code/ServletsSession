package com.bala.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Session extends HttpServlet {

//	int i=1;
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	
		int i=1;
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>welcome to count</h2>");
		out.println(i);
		out.println("</body></html>");
		i++;
	}
	
	

}
