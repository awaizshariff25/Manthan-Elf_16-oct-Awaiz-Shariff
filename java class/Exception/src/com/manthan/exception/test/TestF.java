package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;

public class TestF {
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		File f=new File("Awaiz.txt");
		try
		{
			f.createNewFile();
			System.out.println("file created");
		}
		catch(IOException e)
		{
			System.out.println("sorry couldnt create a file");
		}
		
		System.out.println("main ended");
		
	}

}
