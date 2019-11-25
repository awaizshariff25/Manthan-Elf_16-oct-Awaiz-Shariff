package com.manthan.set.test;

import java.util.Comparator;

public class StudentByPercentage implements Comparator<Student>{

	public int compare(Student a, Student b) {
		if(a.percentage > b.percentage)
		{
			return 1;
		}
		else if (a.percentage < b.percentage)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	/*
	 * public int compare(Student a, Student b) { Double o1=a.percentage; Double
	 * o2=b.percentage; return a.compareTo(b) }
	 */

	
}
