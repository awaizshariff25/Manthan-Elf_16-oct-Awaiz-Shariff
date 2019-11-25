package com.manthan.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestM {

	public static void main(String[] args) {
		
		
		LinkedList li=new LinkedList();
		li.add(23);
		li.add(2.4);
		li.add('f');
		li.add("priya");
		
		Iterator it=li.iterator();


		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
	}
}
