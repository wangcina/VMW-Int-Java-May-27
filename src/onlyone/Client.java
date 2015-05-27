package onlyone;

public class Client {
//	@Inject -- could be used to indicate external injection for this field
	private Data data;

	public static void main(String[] args) throws Throwable {
		new Client().go();
	}
	
	public void go() throws Throwable {
		String className = "onlyone.StaticGlobalData";
		Class<Data> clazz = (Class<Data>)Class.forName(className);
		data = clazz.newInstance();
		runTest(data);

//		runTest(StaticGlobalData.get());
//		runTest(FakeData.get());
	}
	
	public static void runTest(Data d) {
		d.setName("Fred");
	}

}
