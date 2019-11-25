package com.manthan.collection.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
		
		
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
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
