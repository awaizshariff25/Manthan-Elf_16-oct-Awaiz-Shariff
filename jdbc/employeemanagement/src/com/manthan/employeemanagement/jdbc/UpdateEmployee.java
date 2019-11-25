package com.manthan.employeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the emp_id:");
			int empid= sc.nextInt();
			
			System.out.println("enter the mobile:");
			long mobile= sc.nextLong();
			
			Connection con = null;
			PreparedStatement pstmt = null;
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String dburl="jdbc:mysql://localhost:3306/elf_employee_db";
				con = DriverManager.getConnection(dburl,"root","root");
				
				String query="update employee_info set mobile=? where emp_id=?";
				pstmt=con.prepareStatement(query);
				pstmt.setLong(1, mobile);
				
				
				pstmt.setInt(2, empid);
				
				
				int n=pstmt.executeUpdate();
				
				if(n>0)
				{
					System.out.println("employee updated successfully");
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
		}
}
