package abstraction;

public class Gmail extends Google{
	@Override
	void sharefile() {
		System.out.println("share file upto 25MB");
	}
}
