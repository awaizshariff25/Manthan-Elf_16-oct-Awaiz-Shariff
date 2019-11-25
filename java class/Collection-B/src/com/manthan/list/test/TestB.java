package com.manthan.list.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestB {

public static void main(String[] args) {
		
		LinkedHashMap<Character, String> hm=new LinkedHashMap<Character, String>();
		
		hm.put('M', "man");
		hm.put('A', "Apple");
		hm.put('a', "Anil");
		hm.put('f', "Fan");
		
		Set<Map.Entry<Character, String>> se=hm.entrySet();
		
		
		for (Map.Entry<Character, String> x : se)
		{
			Character k=x.getKey();
			String v=x.getValue();
			
			System.out.println("key "+k);
			System.out.println("value "+v);
			System.out.println("--------------------------");
			
		}
	}
}
