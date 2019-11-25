package lamda;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;



public class Testtreeset {

	public static void main(String[] args) {
		
		
		  
		
		
		TreeSet<Student> set=new TreeSet<Student>(StudentSort.comId);
		
		Student s1=new Student("ravi", 9, 78.3);
		Student s2=new Student("priya", 1, 68.3);
		Student s3=new Student("simran", 3, 48.3);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		Iterator<Student> it=set.iterator();
		while(it.hasNext())
		{
			Student s=it.next();
			System.out.println("name is "+s.name);
			System.out.println("Id is "+s.id);
			System.out.println("percentage is "+s.per);
			System.out.println("--------------------------------------");
			
		}
		
	}
}
