package com.manthan.object.test;

public class TestA {
	public static void main(String[] args) {
		student s=new student("priya",1,78.6);
		student v=new student("priya",1,78.6);
		
		boolean res=s.equals(v);
		System.out.println(res);
		
		
		
		//System.out.println(s);
		
		
		/*int i=s.hashCode();
		
		System.out.println(i);
		
		String n=s.toString();
		
		System.out.println(n);*/
	}
}
