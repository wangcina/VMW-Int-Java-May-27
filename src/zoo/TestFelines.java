package zoo;

import java.awt.Color;

public class TestFelines {

	public static void feed(Feline l, int foodWeight) {
		System.out.println("Feeding " + l + " " + foodWeight + " lbs of food");
		l.speak();
	}
	
	public static void main(String[] args) {
		Feline[] fa = {
			new Lion(), new FelixDomesitcus(), new Tiger()	
		};
		for (Feline f : fa) {
			feed(f, f.getWeight()/100);
		}
	}

}
