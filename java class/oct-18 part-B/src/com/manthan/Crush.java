package com.manthan;

public class Crush {
	void recieve(Phone p) {
		if(p instanceof MI) {
			System.out.println("thank you brother");
		}
		
		else if(p instanceof Pixel) {
			System.out.println("thank you dear");
		}
		
		else if(p instanceof Iphone) {
			System.out.println("I love you");
		}
		
		else {
			System.out.println("non-sense");
		}
	}

}
