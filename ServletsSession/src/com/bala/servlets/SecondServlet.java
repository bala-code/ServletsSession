package com.bala.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
	//	System.out.println("In second Servlet");
		
		
		//#using session
		
		  HttpSession session =request.getSession(); 
		  String str =session.getAttribute("tname").toString();
		  System.out.println(str);
		  PrintWriter out = response.getWriter(); //out.println("In Second Servlet");
		  out.println("Welcome");
		 	
		
		//#using cookies
		/*
		 * Cookie cookies[] = request.getCookies(); String str =null; for(Cookie c :
		 * cookies) { if(c.getName().contentEquals("t1")) { str=c.getValue(); } }
		 * 
		 * PrintWriter out = response.getWriter(); out.print("welcome"+str);
		 */
		
		//#using URL rewriting session
		
		//String str = request.getParameter("t1");
		
		//PrintWriter out = response.getWriter();
		//out.print("Welcome"+str);
		
	}

}
