package com.manthan.overloading;

public class TestB {
	 
	
	public static void main(String[] args) {
		 
		Emp e=new Emp();
		e.setId(23);
		e.setName("divya");
		e.setGender('F');
		e.setHeight(5.7);
		
		DBEmp d=new DBEmp();
		d.save(e);
	}
}
