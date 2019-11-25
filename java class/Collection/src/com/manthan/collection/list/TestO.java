package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestO {

	public static void main(String[] args) {
		
		LinkedList<String> al=new LinkedList<String>();
		al.add("vishal");
		al.add("raju");
		al.add("ravi");
		al.add("priya");
		
		System.out.println("----------------For--------------------");
		
		for (int i = 0; i < al.size(); i++) {
			String r=al.get(i);
			System.out.println(r);
		}
		
		
		
		System.out.println("----------------ForEach--------------------");

		for (String object : al) {
			System.out.println(object);
		}
		
		System.out.println("----------------Iterstor--------------------");
		
		Iterator<String> it=al.iterator();


		while (it.hasNext()) {
			String r = it.next();
			System.out.println(r);
		}
		
		
		System.out.println("----------------ListIterstor--------------------");
		
		ListIterator<String> lit=al.listIterator();
		System.out.println("-------------------->forward");
		while(lit.hasNext())
		{
			String o=lit.next();
			System.out.println(o);

		}

		System.out.println("<---------------backward");

		while(lit.hasPrevious())
		{
			String o=lit.previous();
			System.out.println(o);

		}
	}
}
