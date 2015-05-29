package generics;
import java.util.Iterator;

public class ExerciseMyList {

	public static void main(String[] args) {
		MyList<String> mls = new MyList<>();
		mls.add("Fred");
		mls.add("Jim");
		mls.add("Sheila");
		mls.add("Alice");
//		mls.add(new Date());
		System.out.println("> " + mls);
		
		System.out.println("===================");
		for (String s : mls) {
			System.out.println("> " + s);
		}
		
		Iterator<String> i1 = mls.iterator();
		Iterator<String> i2 = mls.iterator();
		
		System.out.println("i1 " + i1.next());
		System.out.println("i2                  " + i2.next());
		System.out.println("i1 " + i1.next());
		System.out.println("i2                  " + i2.next());
		System.out.println("i2                  " + i2.next());
		System.out.println("i1 " + i1.next());
		System.out.println("i1 " + i1.next());
		System.out.println("i2                  " + i2.next());
	}

}
