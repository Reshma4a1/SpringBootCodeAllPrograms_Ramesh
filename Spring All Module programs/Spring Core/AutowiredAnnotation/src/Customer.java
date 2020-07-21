import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	
	private Person person;
	private int type;
	private String action;
	
	public void setType(int type) {
		this.type = type;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {

		return "Customer [person=" + person + ", type=" + type + ", action="
				+ action + "]";
	}

}