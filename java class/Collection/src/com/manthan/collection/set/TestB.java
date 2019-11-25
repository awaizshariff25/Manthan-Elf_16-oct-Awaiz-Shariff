package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("priya");
		hs.add("raju");
		hs.add("divya");
		hs.add("prem");
		hs.add(null);
		hs.add(null);
		
		System.out.println("****************************");
		for (String object : hs) {
			System.out.println(object);
		}
		
		System.out.println("****************************");
		Iterator<String> iterator=hs.iterator();
		while(iterator.hasNext())
		{
			String r =iterator.next();
			System.out.println(r);
		}
	}
}
