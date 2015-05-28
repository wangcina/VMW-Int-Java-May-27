package zoo;

import java.awt.Color;

public class Lion extends Feline {
	public Lion() {
		super(Color.ORANGE, 1200);
	}
	
	public void speak() {
		System.out.println("Roar!!!!");
	}

//	@Override
	public String toString() {
		return "Lion [getFurColor()=" + getFurColor() + ", getWeight()="
				+ getWeight() + "]";
	}
}
