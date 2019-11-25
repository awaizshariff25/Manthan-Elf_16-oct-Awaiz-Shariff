
public class Marker extends Pen{
	Marker()
	{
		this(2);
		System.out.println("B");
	}
	
	Marker(int x)
	{
		//super(5);
		System.out.println("N");
	}
	
	Marker(double x)
	{
		super(5);
		System.out.println("I");
	}

}
