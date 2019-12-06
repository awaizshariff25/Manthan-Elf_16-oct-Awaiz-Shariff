package com.manthan.productdao.test;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manthan.productbean.test.ProductBean;
import com.mysql.jdbc.Connection;

public class ProductDAO {

	public ProductBean productsearch(int product_id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;

		ProductBean bean=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart", "root", "root");
		String sql="select * from product_info";
		pstmt=con.prepareStatement(sql);		
		rs=pstmt.executeQuery();
		if(rs.next()) {
			bean=new ProductBean();
			bean.setProduct_id(rs.getInt("product_id"));
			bean.setProduct_name(rs.getString("product_name"));
			bean.setProduct_cost(rs.getDouble("product_cost"));
			bean.setProduct_color(rs.getString("product_color"));
			bean.setDescription(rs.getString("description"));
			bean.setNumberof_product(rs.getInt("numberof_product"));
			
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
}
