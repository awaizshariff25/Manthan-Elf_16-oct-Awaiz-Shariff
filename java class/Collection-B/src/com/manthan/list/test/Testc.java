package com.manthan.list.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Testc {

	
	public static void main(String[] args) {
		
		List<Double> al=new ArrayList<Double>();
		al.add(2.3);
		al.add(4.6);
		al.add(7.8);
		al.add(5.3);
		
		//Collections.sort(al);
		
		Iterator<Double> it=al.iterator();
		while(it.hasNext())
		{
			Double r=it.next();
			System.out.println(r);
		}
	}
}
