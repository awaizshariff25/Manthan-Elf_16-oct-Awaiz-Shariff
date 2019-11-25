package com.manthan.musicplayer.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DelectSong {

	public void deleteSong() {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the Song_ID:");
		int songid= sc.nextInt();


		Connection con = null;
		PreparedStatement pstmt = null;


		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Musicplayer";
			con = DriverManager.getConnection(dburl,"root","root");

			String query="delete from MusicFiles where Song_ID=?";

			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, songid);


			int n=pstmt.executeUpdate();

			if(n>0)
			{
				System.out.println("song deleted successfully");
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
	}// end of deletesong
}// end of class
