package com.manthan.collection.list;

import java.util.ArrayList;

public class TestH {

	public static void main(String[] args) {
		
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(2.4);
		al.add(5.8);
		al.add(3.6);
		al.add(4.1);
		
		for (Double r : al) {
			System.out.println(r);
		}
	}
}
