package com.manthan.overloading;

public class TestD {
	
	
	public static void main(String[] args) {
		
		Room r=new Room();
		r.run();
		Room.cost=266;
		Room.com.on();
		
		System.out.println("cost is "+Room.cost);
	}
}
