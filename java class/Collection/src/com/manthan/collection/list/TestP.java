package com.manthan.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestP {

	
	public static void main(String[] args) {
		 
		Vector vector=new Vector();
		vector.add('a');
		vector.add(2.4);
		vector.add(15);
		vector.add("deepa");
		
		
		for (int i = 0; i < vector.size(); i++) {
			Object r=vector.get(i);
			System.out.println(r);
		}
		
		
		for (Object object : vector) {
			System.out.println(object);
		}
		
		Iterator it=vector.iterator();


		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
		
		ListIterator lit=vector.listIterator();
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
