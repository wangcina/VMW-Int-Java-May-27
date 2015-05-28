package zoo;

import java.awt.Color;

public class Tiger extends Feline {
	public Tiger() {
		super(Color.ORANGE, 1800);
	}
	
//	@Override
	public void speak() {
		System.out.println("Bigger roar, with extra coolness factor!");
	}

}
