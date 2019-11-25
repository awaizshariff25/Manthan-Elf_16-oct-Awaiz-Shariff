package com.manthan.employeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployee {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the emp_id:");
		int empid= sc.nextInt();
		
		System.out.println("enter the emp_name:");
		String empname= sc.next();
		
		System.out.println("enter the age:");
		int age= sc.nextInt();
		
		System.out.println("enter the salary:");
		double salary= sc.nextDouble();
		
		System.out.println("enter the Designation:");
		String designation= sc.next();
		
		System.out.println("enter the mobile:");
		long mobile= sc.nextLong();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/elf_employee_db";
			con = DriverManager.getConnection(dburl,"root","root");
			
			String query="insert into employee_info values(?,?,?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, empid);
			pstmt.setString(2, empname);
			pstmt.setInt(3, age);
			pstmt.setDouble(4, salary);
			pstmt.setString(5, designation);
			pstmt.setLong(6, mobile);
			
			int n=pstmt.executeUpdate();
			
			if(n>0)
			{
				System.out.println("employee added successfully");
			}
			else
			{
				System.out.println("fail to add");
				
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
		
		
		
	} //end of main
}// end of class
