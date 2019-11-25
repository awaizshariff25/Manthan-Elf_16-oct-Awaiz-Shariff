package com.manthan.project.test;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {
		
		student st=new student("divay", 23, 56.8);
		
		Predicate<student> ps = s->{
			if(s.percentage>=35) {
				return true;
			}else {
				return false;
			}
		};
		
		boolean ans= ps.test(st);
		System.out.println("Result is "+ans);
	}
	
}
