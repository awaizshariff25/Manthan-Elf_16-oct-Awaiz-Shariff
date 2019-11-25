package com.manthan.overloading;

public class TestF {
	
	public static void main(String[] args) {
		 Student s=new Student();
		 s.setId(1);
		 s.setName("priya");
		 
		 DB d=new DB();
		 d.save(s);
		 		
	}
}
