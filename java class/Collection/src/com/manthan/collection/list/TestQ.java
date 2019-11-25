package com.manthan.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestQ {

	public static void main(String[] args) {
		
		Vector<Character> vector=new Vector<Character>();
		vector.add('a');
		vector.add('p');
		vector.add('p');
		vector.add('l');
		vector.add('e');
		
		
		for (int i = 0; i < vector.size(); i++) {
			Character r=vector.get(i);
			System.out.println(r);
		}
		
		
		for (Character object : vector) {
			System.out.println(object);
		}
		
		Iterator<Character> it=vector.iterator();


		while (it.hasNext()) {
			Character r = it.next();
			System.out.println(r);
		}
		
		ListIterator<Character> lit=vector.listIterator();
		System.out.println("-------------------->forward");
		while(lit.hasNext())
		{
			Character o=lit.next();
			System.out.println(o);

		}

		System.out.println("<---------------backward");

		while(lit.hasPrevious())
		{
			Character o=lit.previous();
			System.out.println(o);

		}
	}
}
