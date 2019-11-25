package com.manthan.list.test;


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class TestD {

public static void main(String[] args) {
		
		Hashtable<Character, String> hm=new Hashtable<Character, String>();
		
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
