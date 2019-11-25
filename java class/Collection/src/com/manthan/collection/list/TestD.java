package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {


	public static void main(String[] args) {
		ArrayList al= new ArrayList();

		al.add(5);
		al.add('F');
		al.add(2.4);
		al.add("simran");


		ListIterator lit=al.listIterator();
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
