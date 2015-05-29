package collections;

import java.util.Comparator;

public class Person implements Comparable<Person> {
	private String name;
	private String address;
	private int age;

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age
				+ "]";
	}

	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
	
	private static final Comparator<Person> nameComp = new 
			/* private static class PersonCompareByName implements */ Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.getName().compareTo(o2.getName());
		}

	};

	public static Comparator<Person> getNameComaparator() {
		return nameComp;
	}
	
//	private static final Comparator<Person> addressComp = /*new*/ 
//			/* private static class PersonCompareByName implements Comparator<Person>() {*/ 
//
////		@Override
//		/*public int compare*/(Person o1, Person o2) -> {
//			return o1.getAddress().compareTo(o2.getAddress());
//		};
//
////	};
//
		private static final Comparator<Person> addressComp = 
				(o1, o2) -> o1.getAddress().compareTo(o2.getAddress());

	public static Comparator<Person> getAddressComaparator() {
		return addressComp;
	}
	
}
