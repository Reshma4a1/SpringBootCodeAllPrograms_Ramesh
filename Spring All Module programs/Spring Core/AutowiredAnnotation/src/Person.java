public class Person {
	
	public Person() {
		System.out.println("Person default constructor..");
	}
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
