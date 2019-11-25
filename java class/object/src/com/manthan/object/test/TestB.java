package com.manthan.object.test;

public class TestB {
	public static void main(String[] args) {

		Animal a= new Cow();	


		Cow c=(Cow)a;

		c.cost=24;
		c.size=3.4;
		c.eat();
		c.run();


		System.out.println("cost is"+c.cost);
		System.out.println("size is"+c.size);

	}
}
