package com.manthan.list.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.manthan.set.test.Student;

public class TestArray {

	public static void main(String[] args) {
		
			
			ArrayList<Student> al=new ArrayList<Student>();
			ArrayList<Student> al1=new ArrayList<Student>();
			ArrayList<Student> al2=new ArrayList<Student>();
			Student s1=new Student(5, "raju", 78.5);
			Student s2=new Student(6, "deepa", 98.5);
			Student s3=new Student(1, "priya", 38.5);
					
			
			
			Student s4=new Student(8, "ram", 78.5);
			Student s5=new Student(9, "lohit", 98.5);
			Student s6=new Student(14, "zee", 38.5);
						
			
			Student s7=new Student(15, "gagan", 78.5);
			Student s8=new Student(36, "ganesh", 98.5);
			Student s9=new Student(12, "awaiz", 38.5);
						
			
			
			al.add(s1);
			al.add(s2);
			al.add(s3);
			al1.add(s4);
			al1.add(s5);
			al1.add(s6);
			al2.add(s7);
			al2.add(s8);
			al2.add(s9);
			
			HashMap<String, ArrayList<Student>> map= new HashMap<String, ArrayList<Student>>();
			
			
			map.put("first", al);
			map.put("second", al1);
			map.put("third", al2);
			
			Set<Map.Entry<String, ArrayList<Student>>> ts = map.entrySet();
			
			for(Map.Entry<String, ArrayList<Student>> e:ts)
			{
				String key =e.getKey();
				ArrayList<Student> al4=e.getValue();
				System.out.println("class name "+key);
				Iterator<Student> it=al.iterator();
				while(it.hasNext())
				{
					Student s=it.next();
					System.out.println("name is "+s.name);
					System.out.println("Id is "+s.id);
					System.out.println("percentage is "+s.percentage);
					System.out.println("--------------------------------------");
					
				}
				System.out.println("************************************");
				
			}
			
			
			
			
			
	}
}
