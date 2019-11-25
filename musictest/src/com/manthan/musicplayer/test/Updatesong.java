package com.manthan.musicplayer.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Updatesong {

	public void updateSongs() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the Song_ID:");
		int songid= sc.nextInt();
		
		System.out.println("enter the Song Name:");
		String songname= sc.next();
		System.out.println("enter the Artist Name:");
		String arname= sc.next();
		System.out.println("enter the Album Name:");
		String alname= sc.next();
		System.out.println("enter the Song location:");
		String songloc= sc.next();
		System.out.println("enter the Song Description:");
		String desc= sc.next();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Musicplayer";
			con = DriverManager.getConnection(dburl,"root","root");
			
			String query="update MusicFiles set Song_Title=?, Artist_Name=?, Album_Name=?, Song_Location=?, Description=? where Song_ID=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, songname);
			pstmt.setString(2, arname);
			pstmt.setString(3, alname);
			pstmt.setString(4, songloc);
			pstmt.setString(5, desc);
			pstmt.setInt(6, songid);
			
			
			int n=pstmt.executeUpdate();
			
			if(n>0)
			{
				System.out.println("song updated successfully");
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
