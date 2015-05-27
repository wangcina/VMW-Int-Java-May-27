package automobiles;

import java.util.HashMap;

public class Car {
	private String name;
	private int gasRemaining;
	
	public Car(String name, int additionalGas) {
		if (additionalGas < 0 || additionalGas > 13) {
			throw new IllegalArgumentException("That's not a valid amount of gas");
		}
			
		this.name = name; 
		gasRemaining = 1 + additionalGas;
	}
	
	private static HashMap<String, Car> ourCars = new HashMap<>();

	public static Car getWithNameAndFuelCategory(String name, String category) {
		String identity = category + name;
		Car c = ourCars.get(identity);
		if (c == null) {
			c = makeCarWithNameAndFuelCategory(name, category);
			ourCars.put(identity, c);
		}
		return c;
	}
	
	public static Car makeCarWithNameAndFuelCategory(String name, String category) {
		int capacity;
		switch(category){
		case "LARGE": capacity = 16; break;
		case "MEDIUM": capacity = 12; break;
		case "SMALL": capacity = 8; break;
		default: throw new IllegalArgumentException("Bad capacity String");
		}
		return new Car(name, capacity);
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", gasRemaining=" + gasRemaining + "]";
	}

	public static void main(String [] args) {
		Car c = new Car("Algernon", 7);
		System.out.println("Car is " + c);
	}
	

}
