package lamda;

public class TestB {

	public static void main(String[] args) {
		
		Factorial f1=x->{
			int f=1;
			for (int i = 1; i <= x; i++) {
				f=f*1;
			}
			return f;
		};
		
		int y=f1.fact(5);
		
		System.out.println("factorial= "+y);
	}
}
