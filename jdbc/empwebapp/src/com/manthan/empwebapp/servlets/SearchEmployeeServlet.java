package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchemp")

public class SearchEmployeeServlet extends HttpServlet{

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// get the form data
			String empIdVal=req.getParameter("empId");
			int empid=Integer.parseInt(empIdVal);
			System.out.println(empid);
			
			Connection con=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			PrintWriter out=resp.getWriter();
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db","root","root");
				
				String query="select * from employee_info where emp_id=?";
				pstmt=con.prepareStatement(query);
				pstmt.setInt(1, empid);
				rs=pstmt.executeQuery();
				
				out.println("<html>");
				out.println("<body>");
				if(rs.next())
				{
//					int empId= rs.getInt("emp_id");
//					String name=rs.getString("emp_name");
//					int age=rs.getInt("age");
//					double Salary=rs.getDouble("salary");
//					String designation= rs.getString("designation");
					
					out.println("<h2> Employee ID "+empid+" Found- </h2>");
					out.println("Name : "+rs.getString("emp_name"));
					out.println("Age : "+rs.getInt("age"));
					out.println("Salary : "+rs.getInt("salary"));
					out.println("Designation : "+rs.getString("designation"));
					out.println("Mobile : "+rs.getLong("mobile"));
					
				}
				else
				{
					out.print("<h2 style='color:red;'> Employee Id "+empid+" Not Found</h2>");
				}
				out.println("</body>");
				out.println("</html>");
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			finally
			{
				out.close();
				
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
			}
			
		}//end of class
}// end of class
