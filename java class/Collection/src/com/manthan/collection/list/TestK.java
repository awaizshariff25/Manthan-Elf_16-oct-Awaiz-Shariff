package com.manthan.collection.list;

import java.util.LinkedList;

public class TestK {

	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		li.add(23);
		li.add(2.4);
		li.add('f');
		li.add("priya");
		
		for (int i = 0; i < li.size(); i++) {
			Object r=li.get(i);
			System.out.println(r);
		}
		
	}
}
