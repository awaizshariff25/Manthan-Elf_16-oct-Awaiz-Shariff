
public class TestB {
	public static void main(String[] args) {
		Pen p=new Marker();
		p.cost=1000;
		p.open();
		p.close();
		p.write();
		p.color();
		
		System.out.println("The cost is"+p.cost);
	}

}
