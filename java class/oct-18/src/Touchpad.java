
public class Touchpad implements Mouse, Keyboard {

	@Override
	public void press() {
		System.out.println(" I am a key-press");

	}

	@Override
	public void click() {
		
		System.out.println(" I am a mouse-click");

	}

}
