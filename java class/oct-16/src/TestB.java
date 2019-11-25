
public class TestB {
	public static void main(String[] args) {
		Van v=new Van();
		v.cost=500;
		System.out.println("the cost is "+v.cost);
		v.move();
		v.stop();
	}

}
