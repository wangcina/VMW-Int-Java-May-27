package onlyone;

public class Runner {
	@Inject
	private Data data;
	private String aString;
	
	@RunMe(value="Hello", count=5)
	public void runTest() {
		data.setName("Fred");
	}
	
	@RunMe("Goodbye")
	public void again() {
		System.out.println("Hey, look at this...");
	}

}
