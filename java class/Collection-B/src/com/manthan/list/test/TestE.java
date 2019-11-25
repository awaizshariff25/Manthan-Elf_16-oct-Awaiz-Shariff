package com.manthan.list.test;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class TestE {

public static void main(String[] args) {
		
		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		
		hm.put(5,"raju");
		hm.put(7,"ravi");
		hm.put(3,"anil");
		hm.put(1,"priya");
		
		Set<Map.Entry<Integer, String>> se=hm.entrySet();
		
		
		for (Map.Entry<Integer, String> x : se)
		{
			Integer k=x.getKey();
			String v=x.getValue();
			
			System.out.println("key "+k);
			System.out.println("value "+v);
			System.out.println("--------------------------");
			
		}
	}
}
