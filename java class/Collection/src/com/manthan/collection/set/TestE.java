package com.manthan.collection.set;

import java.util.HashSet;

public class TestE {

	public static void main(String[] args) {
		
		HashSet<Person> hs=new HashSet<Person>();
		
		Person p1=new Person("priya", 1, 1.34);
		Person p2=new Person("raju", 2, 1.78);
		Person p3=new Person("divya", 4, 1.64);
		Person p4=new Person("prem", 5, 1.99);
		
		
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
	
		
		for (Person person : hs) {
			System.out.println("name is "+person.name);
			System.out.println("Id is "+person.id);
			System.out.println("height is "+person.height);
			System.out.println("-----------------------------");
			
		}
	}
}
