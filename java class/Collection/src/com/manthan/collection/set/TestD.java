package com.manthan.collection.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("priya");
		hs.add(14);
		hs.add("divya");
		hs.add('m');
		hs.add(null);
		hs.add(null);
		
		System.out.println("****************************");
		for (Object object : hs) {
			System.out.println(object);
		}
		
		System.out.println("****************************");
		Iterator iterator=hs.iterator();
		while(iterator.hasNext())
		{
			Object r =iterator.next();
			System.out.println(r);
		}
	}
}
