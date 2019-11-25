package com.manthan.set.test;

import java.util.Iterator;
import java.util.TreeSet;

public class TestA {

	
	public static void main(String[] args) {
		 
		StudentByPercentage byPercentage=new StudentByPercentage();
		StudentById byId=new StudentById();
		
		
		Student s1=new Student(5, "raju", 78.5);
		Student s2=new Student(6, "deepa", 98.5);
		Student s3=new Student(1, "priya", 38.5);
		Student s4=new Student(3, "rima", 79.5);
		
		TreeSet<Student> set=new TreeSet<Student>(byPercentage);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		TreeSet<Student> set1=new TreeSet<Student>(byId);
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(s4);
		
		Iterator<Student> iterator=set.iterator();
		while(iterator.hasNext())
		{
			Student student=iterator.next();
			System.out.println("Id is "+student.id);
			System.out.println("Id is "+student.name);
			System.out.println("Id is "+student.percentage);
			System.out.println("-----------------------------------------");
		}
		
		System.out.println("******************BY ID*************************");
		Iterator<Student> iterator1=set1.iterator();
		while(iterator1.hasNext())
		{
			Student student=iterator1.next();
			System.out.println("Id is "+student.id);
			System.out.println("Id is "+student.name);
			System.out.println("Id is "+student.percentage);
			System.out.println("-----------------------------------------");
		}
	}
}
