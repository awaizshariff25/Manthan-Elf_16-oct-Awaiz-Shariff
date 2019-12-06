package com.manthan.orderdao.test;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manthan.orderbean.test.OrderBean;
import com.mysql.jdbc.Connection;

public class OrderDAO {

	public OrderBean bill() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;

		OrderBean bean=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart", "root", "root");
			String sql="select * from product_info";
			pstmt=con.prepareStatement(sql);		
			rs=pstmt.executeQuery();
			if(rs.next()) {
				bean=new OrderBean();
				bean.setOrderid(rs.getInt("order_id"));
				bean.setProductid(rs.getInt("product_id"));
				bean.setUserid(rs.getInt("user_id"));
				bean.setPrice(rs.getDouble("price"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
		return bean;
	}

	public void orderHistory() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;

		OrderBean bean=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart", "root", "root");
			String sql="select sum(price) from order_info o, product_info p where p.product_id==o.product_id ";
			pstmt=con.prepareStatement(sql);		
			rs=pstmt.executeQuery();
			double totalprice=0;
			
			if(rs.next()) {
				bean=new OrderBean();
				bean.setOrderid(rs.getInt("order_id"));
				bean.setProductid(rs.getInt("product_id"));
				bean.setUserid(rs.getInt("user_id"));
				bean.setPrice(rs.getDouble("price"));
				totalprice+=rs.getDouble("price");
			}
			
			if(totalprice<100) {
				totalprice+=50;
			
			} else if(totalprice>100 && totalprice <500) {
				totalprice+=25;
			} else {
				totalprice+=0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}
}



