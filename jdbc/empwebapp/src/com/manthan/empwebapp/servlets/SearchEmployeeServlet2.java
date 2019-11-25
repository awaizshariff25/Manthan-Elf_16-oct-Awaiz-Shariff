package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOImpl;
import com.manthan.empwebapp.util.EmployeeDAOImplManager;

@WebServlet("/searchEmployee2")
public class SearchEmployeeServlet2  extends HttpServlet{

	 private EmployeeDAO dao= EmployeeDAOImplManager.getDaoInstance();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int empidval=Integer.parseInt(req.getParameter("empId"));
		
		EmployeeInfoBean employeeInfoBean= dao.searchEmployee(empidval);
		PrintWriter out=resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		if(employeeInfoBean != null)
		{
			out.println("<h2> Employee ID "+empidval+" Found- </h2>");
			out.println("<br>Name : "+employeeInfoBean.getEmpname());
			out.println("<br>Age : "+ employeeInfoBean.getAge());
			out.println("<br>salary : "+ employeeInfoBean.getSalary());
			out.println("<br>Designation : "+ employeeInfoBean.getDesignation());
			out.println("<br>Mobile : "+ employeeInfoBean.getMobile());
		}
		else
		{
			out.print("<h2 style='color:red;'> Employee Id "+empidval+" Not Found</h2>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
