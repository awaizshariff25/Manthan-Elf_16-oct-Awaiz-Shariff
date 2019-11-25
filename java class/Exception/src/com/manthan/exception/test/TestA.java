package com.manthan.exception.test;


public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		
		try {
			System.out.println(10/2);
		}
		
		catch(ArithmeticException a){
			System.out.println("please dont divide by zero");
		}
		
		System.out.println("main ended");
	}

}
