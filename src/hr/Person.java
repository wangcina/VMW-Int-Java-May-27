package hr;

public class Person {
	private String name;
	private String notes;

	public Person(String name, String notes) {
		super();
		this.name = name;
		this.notes = notes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", notes=" + notes + "]";
	}

}
