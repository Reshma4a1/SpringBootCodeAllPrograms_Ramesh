
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rameshit.services.CustomerService;

public class Client {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");

		CustomerService customer = (CustomerService) appContext.getBean("customerService");
		
//		customer.addCustomer();
//		
//		System.out.println("----------------");
//		
//		customer.addCustomerReturnValue();
//		
//		customer.addCustomerThrowException();
		
		customer.addCustomerAround("Ramesh");

	}
}