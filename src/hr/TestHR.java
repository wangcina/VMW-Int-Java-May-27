package hr;

public class TestHR {

	public static void main(String[] args) {
		Person [] pa = {
				new Person("Fred", ""),
				new Employee("Joe", "Good worker", 120_000)
		};
		for (Person p : pa) {
			System.out.println("> " + p);
		}
		
		// Receive resume
		Person candidate = new Person("Sheila", "");
		
		interview(candidate);
		System.out.println("Candidate after interview: " + candidate);
		Employee employee = employ(candidate);
		System.out.println("Employee is " + employee);
		System.out.println("Candidate" + candidate);
	}

	private static void interview(Person candidate) {
		candidate.setNotes(candidate.getNotes() + "Good skills, bizzare hobbies");
	}

	private static Employee employ(Person p) {
		return new Employee(p.getName(), p.getNotes(), 50_000);
	}
}
