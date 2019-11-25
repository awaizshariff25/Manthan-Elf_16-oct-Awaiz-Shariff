package com.manthan.project.test;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class TestG {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(7);
		
		System.out.println(al);
		
		Predicate<Integer> p= i->i%2!=0;
		
//		ArrayList<Integer> bl= new ArrayList<Integer>();
//		
//				
//		for (Integer x : al) {
//			
//			if(p.test(x)) {
//				bl.add(x);
//			}
//			
//		}
		
		List<Integer> bl= al.stream().filter(p).collect(Collectors.toList());
		
		System.out.println(bl);
		
	}
}
