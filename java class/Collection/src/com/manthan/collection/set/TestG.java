package com.manthan.collection.set;

import java.util.TreeSet;

public class TestG {
	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("simran");
		ts.add("priya");
		ts.add("raju");
		ts.add("divya");
		ts.add("PRIYA");
		ts.add("pRiya");
		
		for (String string : ts) {
			System.out.println(string);
		}
	}

}
