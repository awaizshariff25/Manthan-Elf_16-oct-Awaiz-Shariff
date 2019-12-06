package com.manthan.hoteluserdata.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.manthan.hotelapp.test.AllFood;
import com.mysql.fabric.xmlrpc.base.Array;

public class UserFoodData {

	public void userorder() {

		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;

		AllFood food= new AllFood();
		food.showAll();

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/hotel_db";
			con = DriverManager.getConnection(dburl,"root","root");
			Scanner sc= new Scanner(System.in);

			System.out.println("enter total number of orders");
			int n=sc.nextInt();
			int arr[] = new int[n];
			System.out.println("enter the  above food id to order");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int total=0;
			for(int i=0;i<n;i++) {
				String query= "select *from hotel_bill where item_code=?";
				pstmt=con.prepareStatement(query);
				pstmt.setInt(1, arr[i]);
				rs=pstmt.executeQuery();

				if(rs.next()) {
					System.out.println("Food ID = "+ rs.getInt("item_code"));
					System.out.println("Food Name = "+rs.getString("food_name"));
					System.out.println("price = "+rs.getDouble("price"));

					total+=rs.getDouble("price");
				}
			}
			System.out.println("Total Price :"+total);

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
			if(pstmt!=null)
			{
				try
				{
					pstmt.close();
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


		}// end of finally

	}// end of user order

	public void totalbill() {

		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/hotel_db";
			con = DriverManager.getConnection(dburl,"root","root");

			String query="select sum(price) as total from hotel_bill";
			pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery();

			if(rs.next()) {
				System.out.println("total bill for the day : "+rs.getDouble("total"));
			} else {
				System.out.println("no data");
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
			if(pstmt!=null)
			{
				try
				{
					pstmt.close();
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


		}// end of finally
	}// end of total
}
