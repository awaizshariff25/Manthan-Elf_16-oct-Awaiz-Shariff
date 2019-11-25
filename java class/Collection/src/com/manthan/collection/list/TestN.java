package com.manthan.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestN {

	public static void main(String[] args) {
		
		
		LinkedList li=new LinkedList();
		li.add(23);
		li.add(2.4);
		li.add('f');
		li.add("priya");
		
		ListIterator lit=li.listIterator();
		System.out.println("-------------------->forward");
		while(lit.hasNext())
		{
			Object o=lit.next();
			System.out.println(o);

		}

		System.out.println("<---------------backward");

		while(lit.hasPrevious())
		{
			Object o=lit.previous();
			System.out.println(o);

		}
	}
}
