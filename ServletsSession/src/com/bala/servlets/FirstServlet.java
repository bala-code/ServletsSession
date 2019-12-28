package com.bala.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	 
	public void daGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{	
		
		
		
		//	RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
		//  rd.forward(request, response);
		
		//#using sendRedirect and session
		
		  String str = request.getParameter("tname"); 
		  HttpSession session = request.getSession(); 
		  session.setAttribute("tname", str);
		  response.sendRedirect("SecondServlet"); // when we use this ,request cannot able to send to another servlet.so we need to use HttpSession session.
		 	
		
		//#using cookie
		/*
		 * String str = request.getParameter("tname"); Cookie cookie = new
		 * Cookie("tname",str); response.addCookie(cookie);
		 * response.sendRedirect("SecondServlet");
		 */
		
		//using url 
//		String str = request.getParameter("tname");
//		response.sendRedirect("SecondServlet?tname="+str);
		
		
	}

}
