package com.manthan.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestD {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin=new FileInputStream("vikas.txt");
			
			int m;
			
			while((m=fin.read())!=-1)
			{
				System.out.print((char)m);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
