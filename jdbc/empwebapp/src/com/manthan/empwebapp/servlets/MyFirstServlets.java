package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlets extends HttpServlet{

	public MyFirstServlets(){
		 System.out.println("inside constructor");
	 }
	
	/*
	 * @Override protected void doGet(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { Date date=new Date();
	 * 
	 * ServletContext context=getServletContext(); String
	 * code=context.getInitParameter("countryCode");
	 * 
	 * ServletConfig config=getServletConfig(); String
	 * msg=config.getInitParameter("message"); // resp.setHeader("refresh","1");
	 * PrintWriter out=resp.getWriter(); out.print("<html>"); //
	 * out.print("<head>"); // out.print("<meta http-equiv='refresh' content='2'>");
	 * // out.print("/<head>"); out.print("<body>");
	 * out.print("<h1> Current Date and Time-<br>"+date+"</h1>"); out.print(msg);
	 * out.print("<br> Country code : "+code); out.print("</body>");
	 * out.print("</html>");
	 * 
	 * } // end of doGet
	 */} // end of class
