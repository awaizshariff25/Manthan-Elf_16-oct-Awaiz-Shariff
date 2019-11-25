package com.manthan.exception.test;

public class Paytm {
	void book()
	{
		System.out.println("book started");
		
		IRCTC i=new IRCTC();
		try
		{
		i.confirm();
		}
		catch(ArithmeticException a)
		{
			System.out.println("exception caught at book");
			//throw a;
		}
		//finally {
		System.out.println("book ended");
		//}
	}

}
