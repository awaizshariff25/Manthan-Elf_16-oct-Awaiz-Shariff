package com.manthan.shopping.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.ShoppingUserdao.test.UserDAO;
import com.manthan.userbean.test.UserBean;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	UserDAO dao=new UserDAO();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("username");
		String password=req.getParameter("password");

		UserBean userBean=dao.authenticate(name, password);
		if(userBean!=null) {
	      HttpSession session=req.getSession(true);
	      session.setAttribute("userBean", userBean);
	      req.getRequestDispatcher("./SearchForm.jsp").forward(req, resp);
		}
		else {
			
			req.setAttribute("msg", "Invalid credentials!!");
			req.getRequestDispatcher("./LoginForm.jsp").forward(req, resp);
		}
		
		
	}
}
