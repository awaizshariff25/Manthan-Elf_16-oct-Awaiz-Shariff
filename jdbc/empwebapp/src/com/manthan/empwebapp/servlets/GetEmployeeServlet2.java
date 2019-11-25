package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet2 extends HttpServlet {
		
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String empIdVal=req.getParameter("empId");
		
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Employee Details for Emp ID: "+ empIdVal+"</h2>");
		out.println("Employee Name = Naveen<br>");
		out.println("Salary = 78000<br>");
		out.println("Designation = SD<br>");
		out.println("</body>");
		out.println("</html>");
	}
}
