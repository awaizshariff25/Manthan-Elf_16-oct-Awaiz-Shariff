package com.manthan.employeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SearchEmployee {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the emp_id");
		int emp_id=sc.nextInt();
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/elf_employee_db";
			con = DriverManager.getConnection(dburl,"root","root");
			
			String query="select *from employee_info where emp_id = ?";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, emp_id);
			
			
			rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				System.out.println("employee id found");
				System.out.println("ID = "+rs.getInt("emp_id"));
				System.out.println("Name = "+rs.getString("emp_name"));
				System.out.println("Salary = "+rs.getInt("salary"));
			}
			else
			{
				System.out.println("Employee not found");
			}
			
		}
		catch (Exception e)
		{
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
		} //end of finally

	} //end of main

} // end of class
