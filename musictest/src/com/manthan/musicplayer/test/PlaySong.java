package com.manthan.musicplayer.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.concurrent.Delayed;

import org.omg.CORBA.PUBLIC_MEMBER;

public class PlaySong {

	Connection con=null;
	Statement stmt=null;
	PreparedStatement pstmt = null;
	ResultSet rs=null;
	
	Scanner sc= new Scanner(System.in);

	public void playAllSongs() {



		try {

			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Musicplayer";
			con = DriverManager.getConnection(dburl,"root","root");

			stmt = con.createStatement();


			rs = stmt.executeQuery("select *from MusicFiles");


			while(rs.next())
			{
				for(int i=1;i<10000;i++) {}
				int songid=rs.getInt("Song_Id");
				String songname=rs.getString("Song_Title");
				String arname=rs.getString("Artist_Name");
				String alname=rs.getString("Album_Name");
				String songloc=rs.getString("Song_location");
				String desc=rs.getString("Description");



				System.out.println("Song ID = "+songid);
				System.out.println("Song Name = "+songname);
				System.out.println("Artist Name = "+arname);
				System.out.println("Album Name = "+alname);
				System.out.println("Song Location = "+songloc);
				System.out.println("Designation = "+desc);
				System.out.println("-----------------------------------------------------");
				Thread.sleep(1000);
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
			if(stmt!=null)
			{
				try
				{
					stmt.close();
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
	}// end of palyallsong

	public void playRandomSongs() {

			try {

				Class.forName("com.mysql.jdbc.Driver");
				String dburl="jdbc:mysql://localhost:3306/Musicplayer";
				con = DriverManager.getConnection(dburl,"root","root");

				stmt = con.createStatement();


				rs = stmt.executeQuery("select *from MusicFiles order by Album_Name");


				while(rs.next())
				{
					int songid=rs.getInt("Song_Id");
					String songname=rs.getString("Song_Title");
					String arname=rs.getString("Artist_Name");
					String alname=rs.getString("Album_Name");
					String songloc=rs.getString("Song_location");
					String desc=rs.getString("Description");



					System.out.println("Song ID = "+songid);
					System.out.println("Song Name = "+songname);
					System.out.println("Artist Name = "+arname);
					System.out.println("Album Name = "+alname);
					System.out.println("Song Location = "+songloc);
					System.out.println("Designation = "+desc);
					Thread.sleep(1000);
					System.out.println("-----------------------------------------------------");
					
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
				if(stmt!=null)
				{
					try
					{
						stmt.close();
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
			
		}// end of playrandomsong
	
	public void playASong() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/Musicplayer";
			con = DriverManager.getConnection(dburl,"root","root");
			
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the Song Name");
			String songname=sc.next();
			
			String query="select *from MusicFiles where Song_Title = ?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, songname);
			
			
			rs=pstmt.executeQuery();

			
			if(rs.next())
			{
				System.out.println("Song found");
				System.out.println("ID = "+rs.getInt("Song_ID"));
				System.out.println("Song Name = "+rs.getString("Song_Name"));
				System.out.println("Artist Name = "+rs.getInt("Artist_Name"));
				System.out.println("Album Name = "+rs.getInt("Album_Name"));
				System.out.println("Song Location = "+rs.getInt("Song_Location"));
				Thread.sleep(1000);
				System.out.println("-----------------------------------------------------");

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
			if(stmt!=null)
			{
				try
				{
					stmt.close();
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
	}// end of playasong
}// end of class
