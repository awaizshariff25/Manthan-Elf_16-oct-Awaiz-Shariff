package com.manthan.project.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestJ {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(7);
		
		Comparator<Integer> c = (i,j)->i.compareTo(j);
		
		int ans=al.stream().max(c).get();
		int ans1=al.stream().min(c).get();
		
		
		System.out.println(ans);
		System.out.println(ans1);
	}
}
