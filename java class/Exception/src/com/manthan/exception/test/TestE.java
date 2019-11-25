package com.manthan.exception.test;

public class TestE {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		Paytm p=new Paytm();
		try
		{
		p.book();
		}
		catch(ArithmeticException a)
		{
			System.out.println("exception caught at main");
		}
		System.out.println("main ended");
	}

}
