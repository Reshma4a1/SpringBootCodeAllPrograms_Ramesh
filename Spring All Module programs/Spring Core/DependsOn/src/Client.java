

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("---------------------");
		
		Employee employee = context.getBean("employee", Employee.class);
		
		System.out.println(employee);
		
	}

}
