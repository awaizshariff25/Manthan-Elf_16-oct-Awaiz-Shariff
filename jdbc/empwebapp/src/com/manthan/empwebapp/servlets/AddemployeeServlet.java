package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.util.EmployeeDAOImplManager;

@WebServlet("/addEmployee")
public class AddemployeeServlet extends HttpServlet{

	EmployeeDAO dao= EmployeeDAOImplManager.getDaoInstance();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			EmployeeInfoBean bean=(EmployeeInfoBean) session.getAttribute("employeeInfoBean");
			
			int empId=Integer.parseInt(req.getParameter("empId"));
			String empname= req.getParameter("empname");
			int age=Integer.parseInt(req.getParameter("age"));
			double salary=Double.parseDouble(req.getParameter("empId"));
			long mobile=Long.parseLong(req.getParameter("mobile"));
			String designation= req.getParameter("designation");

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setEmpname(empname);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setMobile(mobile);


			
			

			if(dao.addEmployee(employeeInfoBean))
			{
				out.println("<h2> Record Inserted Successfully....</h2>");
				out.println("<h3> Thanks "+ bean.getEmpname()+" to add Employee "); 

			}
			else
			{
				out.println("<h2>sorry "+ bean.getEmpname()+"  Failed to add Record....</h2>");
				
			}
			
		}
		else
		{
			out.print("<h2> please login </h2>");
			req.getRequestDispatcher("./LoginForm.html").include(req, resp);
		}
		out.println("</body>");
		out.println("</html>");
	}
}
