package com.manthan.exception.test;

public class TestC {

	public static void main(String[] args) {
		System.out.println("main started");
		
		String name=null;
		try
		{
			System.out.println(10/0);
			System.out.println("Hi");
			System.out.println("Have a good day");
			System.out.println(name.length());
		}
		catch(ArithmeticException a)
		{
			System.out.println("dont divide by zero");
		}
		catch(NullPointerException a)
		{
			System.out.println("dont deal with null");
		}
		
		
		System.out.println("main ended");
	}
}
