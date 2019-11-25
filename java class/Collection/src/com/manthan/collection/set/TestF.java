package com.manthan.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestF {

	public static void main(String[] args) {

		LinkedHashSet<Person> hs=new LinkedHashSet<Person>();

		Person p1=new Person("priya", 1, 1.34);
		Person p2=new Person("raju", 2, 1.78);
		Person p3=new Person("divya", 4, 1.64);
		Person p4=new Person("prem", 5, 1.99);
		Person p5=new Person("priya", 1, 1.34);

		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);

		for (Person person : hs) {
			System.out.println("name is "+person.name);
			System.out.println("Id is "+person.id);
			System.out.println("height is "+person.height);
			System.out.println("-----------------------------");
		}
		Iterator<Person> iterator=hs.iterator();
		while(iterator.hasNext())
		{
			Object object=iterator.next();
			System.out.println(object);
		}

	}
}

