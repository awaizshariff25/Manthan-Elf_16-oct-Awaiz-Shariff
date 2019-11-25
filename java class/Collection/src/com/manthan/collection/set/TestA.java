package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {

	
	public static void main(String[] args) {
		
		
		HashSet hs=new HashSet();
		hs.add("priya");
		hs.add(14);
		hs.add("divya");
		hs.add('m');
		
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
