package com.manthan.overloading;

public class DB {
	
	
	void save(Student stu)
	{
		System.out.println("*****************Saving data in DB**************");
		System.out.println("Name is "+stu.getName());
		System.out.println("Id is "+stu.getId());
	}
}
