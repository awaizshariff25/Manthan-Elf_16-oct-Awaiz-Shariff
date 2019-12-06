package com.manthan.shopping.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.productbean.test.ProductBean;
import com.manthan.productdao.test.ProductDAO;

public class OrderdetailsServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session!=null) {
			int productId=Integer.parseInt(req.getParameter("product_id"));
			ProductDAO dao=new ProductDAO();
			ProductBean bean=dao.productsearch(productId);

			if(bean != null) {
				req.setAttribute("productsearch", bean);

			}else {
				req.setAttribute("msg", "product Not Found");
			}
			
			

			req.getRequestDispatcher("./OrderForm").forward(req, resp);


		}else {
			req.setAttribute("msg", "please login first");
			req.getRequestDispatcher("./loginForm.jsp").forward(req, resp);
		}
	}
}
