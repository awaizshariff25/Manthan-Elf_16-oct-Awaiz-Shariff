package com.manthan.hotelapp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AllFood {

	Connection con=null;
	Statement stmt=null;
	PreparedStatement pstmt = null;
	ResultSet rs=null;

	public void showAll() {



		try {

			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/hotel_db";
			con = DriverManager.getConnection(dburl,"root","root");

			stmt = con.createStatement();


			rs = stmt.executeQuery("select *from hotel_bill");


			while(rs.next())
			{

				int foodid=rs.getInt("item_code");
				String foodname=rs.getString("food_name");
				double foodprice=rs.getDouble("price");

				System.out.println("Item ID = "+foodid);
				System.out.println("Food Name = "+foodname);
				System.out.println("Price = "+foodprice);

				System.out.println("-----------------------------------------------------");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally
		{

			if(rs!=null)
			{
				try
				{
					rs.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(stmt!=null)
			{
				try
				{
					stmt.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try
				{
					con.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}


		}
	}// end of showAll
}
