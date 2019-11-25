package com.manthan.project.test;

import java.util.function.Function;

public class TestD {

	
	public static void main(String[] args) {
		
		student st= new student("ravi", 23, 55.8);
		
		Function<student, student> fn = s->{
			s.percentage+=4;
			return s;
		};
		
		student stu= fn.apply(st);
		System.out.println("student percentage is "+stu.percentage);
	}
}
