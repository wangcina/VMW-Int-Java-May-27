package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciseListOPerson {

	public static void main(String[] args) {
		List<Person> lp = Arrays.asList(
			new Person("Fred", "Here", 35),
			new Person("Jim", "There", 40),
			new Person("Sheila", "Next Door", 25),
			new Person("Alice", "Upstairs", 45),
			new Person("Bob", "Downstairs", 20)
		);
		System.out.println("> " + lp);
		Person p = new Person("Sheila", "Next Door", 25);
		System.out.println("List " + (lp.contains(p) ? "does" : "doesn't") + " contain " + p);
		
		Map<Person, List<String>> customers = new HashMap<>();
		List<String> ls = Arrays.asList("Bananas", "Apples");
		customers.put(new Person("Fred", "Here", 35), ls);
		ls = Arrays.asList("Burgers", "Fries");
		customers.put(new Person("Jim", "There", 40), ls);
		
		List<String> fredsFood = customers.get(new Person("Fred", "Here", 35));
		System.out.println("Fred eats: " + fredsFood);
		
		System.out.println("map is " + customers);
		
		System.out.println("============================\n> " + lp);
		Collections.sort(lp);
		System.out.println("> " + lp);
		
		System.out.println("============================\n> " + lp);
		Collections.sort(lp, Person.getNameComaparator());
		System.out.println("> " + lp);

		System.out.println("============================\n> " + lp);
		Collections.sort(lp, Person.getAddressComaparator());
		System.out.println("> " + lp);

	}

}
