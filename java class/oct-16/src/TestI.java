
public class TestI {
	public static void main(String[] args) {
		System.out.println("************* this is third gen **************");
		ThirdGen t=new ThirdGen();
		t.call();
		t.mseg();
		t.radio();
		t.camera();
		
		System.out.println("************* this is second gen **************");
		SecondGen s=new SecondGen();
		s.call();
		s.mseg();
		s.radio();
		
		
		System.out.println("************* this is first gen **************");
		FirstGen f=new FirstGen();
		f.call();
		f.mseg();
	}

}
