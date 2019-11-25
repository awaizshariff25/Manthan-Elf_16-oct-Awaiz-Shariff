package com.manthan.project.test;

import java.util.function.Consumer;

public class TestE {

	public static void main(String[] args) {
		student st= new student("divya", 23, 56.8);
		
		Consumer<student> c=
		s ->{
			System.out.println("Name is "+s.name);
			System.out.println("Age is "+s.age);
			System.out.println("percentage is "+s.percentage);
		};
		
		c.accept(st);
	}
}
