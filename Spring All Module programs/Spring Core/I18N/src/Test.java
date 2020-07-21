import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		String message = context.getMessage("hello.message", null, new Locale("en", "US"));

		System.out.println(message);// english message
	}
}
