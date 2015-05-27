package onlyone;

public class StaticGlobalData implements Data {
	private String name;
	private int totalElephants;
	
	private StaticGlobalData() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setting name to " + name);
		this.name = name;
	}

	public int getTotalElephants() {
		return totalElephants;
	}

	public void setTotalElephants(int totalElephants) {
		this.totalElephants = totalElephants;
	}

	private static StaticGlobalData self = new StaticGlobalData();
	
	public static Data get() {
		return self;
	}
	
}
