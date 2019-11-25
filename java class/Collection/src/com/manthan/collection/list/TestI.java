package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestI {

	public static void main(String[] args) {
		
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(2.4);
		al.add(5.8);
		al.add(3.6);
		al.add(4.1);
		
		ListIterator<Double> lit=al.listIterator();
		while(lit.hasNext())
		{
			double r=lit.next();
			System.out.println(r);
		}
		
		while(lit.hasPrevious())
		{
			double r=lit.previous();
			System.out.println(r);
		}
	}
}
