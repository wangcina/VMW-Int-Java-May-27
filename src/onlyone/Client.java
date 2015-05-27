package onlyone;

import java.lang.reflect.Constructor;

public class Client {
//	@Inject -- could be used to indicate external injection for this field
	private Data data;

	public static void main(String[] args) throws Throwable {
		new Client().go();
	}
	
	public void go() throws Throwable {
		String className;
		if (Math.random() > 0.5) {
			className = "onlyone.StaticGlobalData";
		} else {
			className = "onlyone.GlobalDataForTesting";
		}
		Class<Data> clazz = (Class<Data>)Class.forName(className);
		// find the zero argument constructor
		Constructor<Data> constructor = clazz.getDeclaredConstructor();
		
		// disable the access control checks (the constructor might be private)
		constructor.setAccessible(true);
		// create the instance
		data = constructor.newInstance();
		runTest(data);

//		runTest(StaticGlobalData.get());
//		runTest(FakeData.get());
	}
	
	public static void runTest(Data d) {
		d.setName("Fred");
	}

}
