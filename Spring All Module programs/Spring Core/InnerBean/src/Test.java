import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		Employee employee = (Employee) context.getBean("employeeBean");
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAddress().getCity());
		System.out.println(employee.getAddress().getStreet());
		System.out.println(employee.getAddress().getPincode());
		
		//print the data.
		
	}

}
