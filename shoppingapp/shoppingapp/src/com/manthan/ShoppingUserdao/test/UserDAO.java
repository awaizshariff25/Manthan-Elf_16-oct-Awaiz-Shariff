package com.manthan.ShoppingUserdao.test;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manthan.productbean.test.ProductBean;
import com.manthan.userbean.test.UserBean;
import com.mysql.jdbc.Connection;

public class UserDAO {

	public UserBean authenticate(String email, String password) {
		java.sql.Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;

		UserBean bean=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart", "root", "root");
			String sql="select * from user_info where email=? and password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, password);

			rs=pstmt.executeQuery();
			if(rs.next()) {
				bean=new UserBean();
				bean.setEmail(rs.getString("email"));
				bean.setPassword(rs.getString("password"));

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

	public boolean register(UserBean bean) {

		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		boolean registered = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart", "root", "root");
			String sql = "insert into user_info values(?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, bean.getId());
			pstmt.setString(2, bean.getName());
			pstmt.setString(3, bean.getEmail());
			pstmt.setString(4, bean.getPassword());


			int n = pstmt.executeUpdate();

			if (n > 0) {
				registered = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

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
		return registered;
	}


}
