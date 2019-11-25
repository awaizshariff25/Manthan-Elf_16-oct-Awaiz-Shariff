
public class Student {
	int id;
	String name;
	double per;
	void display()
	{
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Percentage is "+per);
	}
	public Student(int id, String name, double per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}
	

}
