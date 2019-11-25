package lamda;

public class TestA {

	public static void main(String[] args) {
		
		Pen p=(a,b)->a+b;
		
		int y=p.add(20, 30);
		System.out.println(y);
	}
}
