package com.manthan.exception.test;

public class TestD {
	public static void main(String[] args) {


		String name=null;
		int a[]=new int[3];
		System.out.println("main started");
		try
		{
			System.out.println(a[5]);
			System.out.println(10/0);
			System.out.println("HI");
			System.out.println("Have a good day");
			System.out.println(name.length());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("divide by zero");
		}
		catch (NullPointerException e) {
			System.out.println("dont deal with null");
		}
	
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("dont cross array size");
		}
		catch(Exception e)
		{
			System.out.println("general exception");
		}
		System.out.println("main ended");
	}

}
