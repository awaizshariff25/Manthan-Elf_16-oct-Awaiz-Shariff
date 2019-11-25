package com.manthan.overloading;

public class DBEmp {
	
	
	void save(Emp e)
	{
		System.out.println("*****************Saving data in DB**************");
		System.out.println("Id is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Gender is "+e.getGender());
		System.out.println("Height is "+e.getHeight());
		
	
	}
	
}
