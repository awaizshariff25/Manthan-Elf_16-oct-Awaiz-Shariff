package com.manthan.hotelappoperation.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Foodoperation {

	public void addFood() {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the Food_ID:");
		int foodid= sc.nextInt();

		System.out.println("enter the Food Name:");
		String foodname= sc.next();
		sc.nextLine();

		System.out.println("enter the Price:");
		double price= sc.nextDouble();

		Connection con = null;
		PreparedStatement pstmt = null;


		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/hotel_db";
			con = DriverManager.getConnection(dburl,"root","root");

			String query="insert into hotel_bill values(?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, foodid);
			pstmt.setString(2, foodname);
			pstmt.setDouble(3, price);

			int n=pstmt.executeUpdate();

			if(n>0)
			{
				System.out.println("Food item added successfully");
			}
			else
			{
				System.out.println("fail to add");

			}

		}// end of try
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{

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
		} //end of finally
	}// end of addFood

	public void removeFood() {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the Food ID:");
		int foodid= sc.nextInt();


		Connection con = null;
		PreparedStatement pstmt = null;


		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/hotel_db";
			con = DriverManager.getConnection(dburl,"root","root");

			String query="delete from hotel_bill where item_code=?";

			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, foodid);


			int n=pstmt.executeUpdate();

			if(n>0)
			{
				System.out.println("Food item deleted successfully");
			}
			else
			{
				System.out.println("fail to delete");

			}

		}// end of try
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{

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
		} //end of finally
	}// end of removeFood

	public void modifyFood() {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the Food_ID:");
		int foodid= sc.nextInt();

		System.out.println("enter the New Food_ID:");
		int foodid1= sc.nextInt();
		System.out.println("enter the food Name:");
		String foodname= sc.next();
		System.out.println("enter the price:");
		double price= sc.nextDouble();

		Connection con = null;
		PreparedStatement pstmt = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/hotel_db";
			con = DriverManager.getConnection(dburl,"root","root");

			String query="update hotel_bill set item_code=?, food_name=?, price=? where item_code=?";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, foodid1);
			pstmt.setString(2, foodname);
			pstmt.setDouble(3, price);
			pstmt.setInt(4, foodid);


			int n=pstmt.executeUpdate();

			if(n>0)
			{
				System.out.println("Food item updated successfully");
			}
			else
			{
				System.out.println("fail to update");

			}

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{

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
		} //end of finally
	}// end of modifyFood
}
