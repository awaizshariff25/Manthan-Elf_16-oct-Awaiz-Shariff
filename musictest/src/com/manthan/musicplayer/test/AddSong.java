package com.manthan.musicplayer.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddSong {

	public void AddSongs() {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the Song_ID:");
		int songid= sc.nextInt();

		System.out.println("enter the Song_Name:");
		String songname= sc.next();

		System.out.println("enter the Arstist Name:");
		String arname= sc.next();

		System.out.println("enter the Album Name:");
		String alname= sc.next();

		System.out.println("enter the Song Location:");
		String songloc= sc.next();

		System.out.println("enter the Description:");
		String desc= sc.next();

		Connection con = null;
		PreparedStatement pstmt = null;


		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Musicplayer";
			con = DriverManager.getConnection(dburl,"root","root");

			String query="insert into MusicFiles values(?,?,?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, songid);
			pstmt.setString(2, songname);
			pstmt.setString(3, arname);
			pstmt.setString(4, alname);
			pstmt.setString(5, songloc);
			pstmt.setString(6, desc);

			int n=pstmt.executeUpdate();

			if(n>0)
			{
				System.out.println("Song added successfully");
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
	}// end of addsongs
}// end of class
