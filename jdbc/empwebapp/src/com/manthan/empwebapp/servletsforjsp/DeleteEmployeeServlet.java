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
import com.manthan.empwebapp.util.EmployeeDAOImplManager;

@WebServlet("/delEmployee")
public class DeleteEmployeeServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession(false);
		if(session!=null) {
			
			EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean) session.getAttribute("employeeInfoBean");
			
			int empId=Integer.parseInt(req.getParameter("empId"));
			
			EmployeeDAO dao= EmployeeDAOImplManager.getDaoInstance();
			employeeInfoBean.setEmpId(empId);
			
			if(dao.delete(empId))
			{
				req.setAttribute("msg", "employee removed successfully");
			}
			else
			{
				req.setAttribute("msg", "emp id not present");
			}
			req.getRequestDispatcher("/deleteEmployeeForm").forward(req, resp);
		}	
		else
		{
			req.setAttribute("msg", "please login again");
			req.getRequestDispatcher("./login2").forward(req, resp);
		}
	}
}
