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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			UserDAO dao=new UserDAO();
			
			UserBean bean=(UserBean) session.getAttribute("userBean");
			
			int id=Integer.parseInt(req.getParameter("user_id"));
			String name=req.getParameter("user_name");
			String email=req.getParameter("email");
			String password=req.getParameter("password");

			UserBean bean1 = new UserBean();
			bean1.setId(id);
			bean1.setName(name);
			bean1.setEmail(email);
			bean1.setPassword(password);
			
			if(dao.register(bean1)) {
				req.setAttribute("msg", "Registered successfully");
			}
			else {
				req.setAttribute("msg", "Failed to register");
			}
			req.getRequestDispatcher("/RegisterForm.jsp").forward(req, resp);
			
		}
		else {
			req.setAttribute("msg", "Please login again");
			req.getRequestDispatcher("./LoginForm.jsp").forward(req, resp);
		}
	}
}
