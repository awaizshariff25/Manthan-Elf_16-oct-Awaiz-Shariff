package com.manthan.collection.set;

public class Person implements Comparable<Person> {

	String name;
	int id;
	double height;
	public Person(String name, int id, double height) {
		this.name = name;
		this.id = id;
		this.height = height;
	}
	@Override
	public int compareTo(Person o) {
			return this.name.compareTo(o.name);
	}

	/*
	 * public int compareTo(Person o) { if(this.id > o.id) { return 1; } else if
	 * (this.id < o.id) { return -1; } else { return 0; } }
	 */
	
//	public int compareTo(Person o) {
//		if(this.height > o.height)
//		{
//			return 1;
//		}
//		else if (this.height < o.height) 
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
	}
	
	
	
	
	

