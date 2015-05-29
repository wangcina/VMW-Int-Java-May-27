package onlyone;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Client {

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
		Object toInject = constructor.newInstance();

		Runner r = new Runner();
		// find field to inject into
		Field [] fields = r.getClass().getDeclaredFields();
		
		for (Field f : fields) {
			System.out.println("field: " + f.getName() + " of type " + f.getType().getName());
			Inject annot = f.getAnnotation(Inject.class);
			if (annot != null) {
				// inject it
				f.setAccessible(true);
				f.set(r, toInject);
			}
		}
		
		// find method to run
		Method[] methods = r.getClass().getMethods();
		for (Method m : methods) {
			System.out.println("Method: " + m.getName());
			RunMe rmAnnot = m.getAnnotation(RunMe.class);
			if (rmAnnot != null) {
				System.out.println("*** Found target method...");
				System.out.println("Annotation params value=" 
						+ rmAnnot.value()
						+ " count=" + rmAnnot.count());
				m.invoke(r);
			}
		}
		
		// run it
	}
	

}
