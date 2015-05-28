package hr;

public class Employee extends Person {
	private long salary;

	public Employee(String name, String notes, long salary) {
		super(name, notes);
		this.salary = salary;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", getName()=" + getName()
				+ ", getNotes()=" + getNotes() + "]";
	}

}
