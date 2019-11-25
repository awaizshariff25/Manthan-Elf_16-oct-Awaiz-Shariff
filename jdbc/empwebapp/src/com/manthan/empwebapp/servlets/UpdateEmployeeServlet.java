package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.util.EmployeeDAOImplManager;

@WebServlet("/update")
public class UpdateEmployeeServlet extends HttpServlet{

	
	EmployeeDAO dao= EmployeeDAOImplManager.getDaoInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			int empId=Integer.parseInt(req.getParameter("empId"));
			long mobile=Long.parseLong(req.getParameter("mobile"));
			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setMobile(mobile);
			if(dao.updateEmployee(employeeInfoBean))
			{
				out.println("<h2> Record updated Successfully....</h2>");

			}
			else
			{
				out.println("<h2> Record Failed to update....</h2>");
			}
		}	
		else
		{
			out.print("<h2> please login </h2>");
			req.getRequestDispatcher("./LoginForm.html").include(req, resp);
		}
		out.println("<a href='./logout'>Logout</a>");
		out.println("</body>");
		out.println("</html>");
	}
	
}
