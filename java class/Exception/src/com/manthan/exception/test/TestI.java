package com.manthan.exception.test;

public class TestI {
	public static void main(String[] args) {
		System.out.println("main started");
		
		AgeSimulator a=new AgeSimulator();
		try 
		{
		a.verify(14);
		System.out.println("enter and enjoy the party");
		}
		catch(InvalidAgeException d)
		{
			d.printStackTrace();
		}
		System.out.println("main ended");
	}

}
