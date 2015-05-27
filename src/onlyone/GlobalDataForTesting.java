package onlyone;

public class GlobalDataForTesting implements Data {
	@Override
	public String getName() {
		return "Jim";
	}

	@Override
	public int getTotalElephants() {
		return 5;
	}

	@Override
	public void setName(String s) {
		System.out.println("Called setName in TESTING variant");
	}

	@Override
	public void setTotalElephants(int te) {
	}
}
