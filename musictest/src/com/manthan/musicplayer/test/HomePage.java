package com.manthan.musicplayer.test;

import java.util.Scanner;

public class HomePage {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 to 'Play all songs'");
		System.out.println("Press 2 to 'Search a songs'");
		System.out.println("Press 3 to 'Show all songs'");
		System.out.println("Press 4 to 'Operate on Songs Database'");
		int input=0;
		while(input!=-1) {
			input=sc.nextInt();
		switch (input) 
		{
			case 1:
				System.out.println("press 'A' to Play All Songs");
				System.out.println("press 'B' to Play Songs Randomly");
				System.out.println("press 'c' to Play a Particular Song");

			
				String ch = sc.next();
					if(ch.equalsIgnoreCase("A")) {
						PlaySong p= new PlaySong();
						p.playAllSongs();
					}
					else if(ch.equalsIgnoreCase("B")) {
						PlaySong p= new PlaySong();
						p.playRandomSongs();
					}
					else if(ch.equalsIgnoreCase("C")) {
						PlaySong p= new PlaySong();
						p.playASong();
					}
					else {
						System.out.println("Invalid Input");
					}

			break;
				
			case 2:
					SearchSong ssong= new SearchSong();
					ssong.search();
					
					break;
			case 3:
				PlaySong pall=new PlaySong();
				pall.playAllSongs();
				
				break;
			
			case 4:
				System.out.println("press 'A' to Add a Songs");
				System.out.println("press 'B' to Edit a Song");
				System.out.println("press 'c' to Delete a Song");
				
				String ch1 = sc.next();
				if(ch1.equalsIgnoreCase("A")) {
					AddSong add=new AddSong();
					add.AddSongs();
				}
				else if(ch1.equalsIgnoreCase("B")) {
					Updatesong update=new Updatesong();
					update.updateSongs();
				}
				else if(ch1.equalsIgnoreCase("C")) {
					DelectSong del=new DelectSong();
					del.deleteSong();
					
				}
				else {
					System.out.println("Invalid Input");
				}

		break;
				
		default:
			System.out.println("Invalid Input");
			break;
		} // end of switch
		
		System.out.println();
		System.out.println();
		System.out.println("=====================================================");
		System.out.println("Press 1 to 'Play all songs'");
		System.out.println("Press 2 to 'Search a songs'");
		System.out.println("Press 3 to 'Show all songs'");
		System.out.println("Press 4 to 'Operate on Songs Database'");
		}// end of while
		
		
		
		
	}// end of home

}// end of class
