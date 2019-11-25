package com.manthan.collection.list;

import java.util.ArrayList;

public class TestB {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();


		al.add(5);
		al.add('F');
		al.add(2.4);
		al.add("simran");

		for (Object object : al) {
			System.out.println(object);
		}
	}
}
