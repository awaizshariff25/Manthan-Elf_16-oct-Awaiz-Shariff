package com.manthan.musicplayer.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchSong {

	public void search() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the Song Name");
		String songname=sc.next();
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Musicplayer";
			con = DriverManager.getConnection(dburl,"root","root");
			
			String query="select *from MusicFiles where Song_Title = ?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, songname);
			
			
			rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Song found");
				System.out.println("ID = "+rs.getInt("Song_ID"));
				System.out.println("Song Name = "+rs.getString("Song_Title"));
				System.out.println("Artist Name = "+rs.getString("Artist_Name"));
				System.out.println("Album Name = "+rs.getString("Album_Name"));
				System.out.println("Song Location = "+rs.getString("Song_Location"));
			}
			else
			{
				System.out.println("Song not found");
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

	}// end of searchsong
	
}// end of class
