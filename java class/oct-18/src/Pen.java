
public abstract class Pen {
	int cost;
	
	void open() {
		System.out.println("This is open() method");
	}
	
	void close() {
		System.out.println("This is class() method");
	}
	
	abstract void write();
	
	abstract void color();

}
