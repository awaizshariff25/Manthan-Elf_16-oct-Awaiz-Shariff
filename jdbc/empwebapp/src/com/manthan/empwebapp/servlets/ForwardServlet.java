package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> Hello User</h2>");
		out.println("</body>");
		out.println("</html>");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("./myfirstservlet");
		dispatcher.forward(req, resp);
		
	}
}
