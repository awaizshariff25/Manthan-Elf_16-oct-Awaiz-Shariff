package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> a=new ArrayList<Student>();
		
		Student s1=new Student("priya",2,78.3);
		Student s2=new Student("ravi",3,65.4);
		Student s3=new Student("prem",6,89.5);
		Student s4=new Student("raju",12,98.4);
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		
		System.out.println("-------------For---------------");
		for (int i = 0; i < a.size(); i++)
		{
			
			Student s=a.get(i);
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.per);
		}
		
		System.out.println("-------------For Each---------------");
		for (Student student : a) {
			System.out.println(student.id);
			System.out.println(student.name);
			System.out.println(student.per);
		}
		
		
		System.out.println("-------------Iterator---------------");
		Iterator<Student> it=a.iterator();


		while (it.hasNext()) {
			Student r = it.next();
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.per);
		}
		
		
		System.out.println("-------------List Iterator---------------");
		ListIterator<Student> lit=a.listIterator();
		System.out.println("-------------------->forward");
		while(lit.hasNext())
		{
			Student o=lit.next();
			System.out.println(o.id);
			System.out.println(o.name);
			System.out.println(o.per);

		}

		System.out.println("<---------------backward");

		while(lit.hasPrevious())
		{
			Student o=lit.previous();
			System.out.println(o.id);
			System.out.println(o.name);
			System.out.println(o.per);

		}
	}
}
