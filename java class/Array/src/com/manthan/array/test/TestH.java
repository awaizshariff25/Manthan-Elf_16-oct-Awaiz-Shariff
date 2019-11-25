package com.manthan.array.test;

public class TestH {
	public static void main(String[] args) {
		int[] x= {1,4,9,6,2};
		Demo d=new Demo();
		d.eat(x);
		
		
		double[] r=d.getme();
		for(double e:r)
		{
			System.out.println(e);
		}
	}
}
