package com.manthan.empwebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOImpl;

@WebServlet("/addEmployee1")
public class AddEmployeeServlet extends HttpServlet{

	private EmployeeDAO dao= new EmployeeDAOImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession(false);
		if(session!=null) {
			
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
			
			if(dao.addEmployee(employeeInfoBean)) {
				req.setAttribute("msg", "employee added successfully");
			}else {
				req.setAttribute("msg", "failed to add");
			}
			req.getRequestDispatcher("/addEmployeeForm1").forward(req, resp);
			
		}else {
			req.setAttribute("msg", "please login again");
			req.getRequestDispatcher("./login2").forward(req, resp);
		}
	}
}
