package com.manthan;

public class TestE {
	public static void main(String[] args) {
		
		MI m=new MI();
		Pixel p=new Pixel();
		Iphone i=new Iphone();
		
		Crush c=new Crush();
		c.recieve(p);
		c.recieve(i);
		c.recieve(m);
		c.recieve(null);
		
		
	}

}
