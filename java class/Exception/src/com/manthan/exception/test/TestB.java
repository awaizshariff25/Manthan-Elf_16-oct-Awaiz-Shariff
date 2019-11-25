package com.manthan.exception.test;

public class TestB {
	
	public static void main(String[] args) {
		System.out.println("main started");
		
		String name= null;
		try
		{
			System.out.println(name.length());
		}
		
		catch(NullPointerException n)
		{
			System.out.println("dont deal with null");
		}
		
		System.out.println("main ended");
	}

}
