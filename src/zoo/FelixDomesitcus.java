package zoo;

import java.awt.Color;

public class FelixDomesitcus extends Feline {
	private String favoriteToy = "laser pointer";
	
	public FelixDomesitcus() {
		super(Color.GRAY, 8);
	}
	
	public void speak() {
		System.out.println("Purrrr purrrrr purrrrr!");
	}

	@Override
	public String toString() {
		return "FelixDomesitcus [favoriteToy=" + favoriteToy
				+ ", getFurColor()=" + getFurColor() + ", getWeight()="
				+ getWeight() + "]";
	}
	
	
}
