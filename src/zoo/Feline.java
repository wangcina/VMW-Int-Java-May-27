package zoo;

import java.awt.Color;

public abstract class Feline {
	private Color furColor;
	private int weight;
	
	public Color getFurColor() {
		return furColor;
	}

	public void setFurColor(Color furColor) {
		this.furColor = furColor;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Feline(Color furColor, int weight) {
		super();
		this.furColor = furColor;
		this.weight = weight;
	}

	public abstract void speak() ;
	
//	@Override
	public String toString() {
		return this.getClass().getName() + "[furColor=" + furColor + ", weight=" + weight + "]";
	}

}
