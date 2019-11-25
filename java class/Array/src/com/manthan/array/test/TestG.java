package com.manthan.array.test;

public class TestG {
	public static void main(String[] args) {
		Student[] s=new Student[4];
		
		
		Student s1=new Student("anitha", 1, 78.3);
		Student s2=new Student("simran", 2, 67.5);
		Student s3=new Student("raju", 3, 55.4);
		Student s4=new Student("geetha", 4, 89.1);
		
		
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		
		for (Student student : s) {
			System.out.println(student.name);
			System.out.println(student.id);
			System.out.println(student.per);
			System.out.println("---------------------------");
		}
	}
}
