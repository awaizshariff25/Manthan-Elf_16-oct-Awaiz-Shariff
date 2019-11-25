package com.manthan.exception.test;

public class TestH {
	public static void main(String[] args) {
		System.out.println("main started");
		
		ATMSimulator a=new ATMSimulator();
		try 
		{
		a.verify(41000);
		}
		catch(DaylimitException d)
		{
			d.printStackTrace();
		}
		System.out.println("main ended");
	}

}
