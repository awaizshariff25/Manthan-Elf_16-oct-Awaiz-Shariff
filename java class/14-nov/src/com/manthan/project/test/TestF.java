package com.manthan.project.test;

import java.util.function.Supplier;

public class TestF {

	
	public static void main(String[] args) {
		
		Supplier<student> sup= ()->new student("dimple", 22, 56.7);
		
		student s=sup.get();
		System.out.println("name is "+s.name);
		System.out.println("age is "+s.age);
		System.out.println("percentage is "+s.percentage);

		
		
	}
}
