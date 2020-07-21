import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"context.xml");

		Employee employee = context.getBean("megastar", Employee.class);

		System.out.println(employee);

		System.out.println("-------------------");

		String aliases[] = context.getAliases("megastar");

		System.out.println("The following are Alias names of Chiranjeevi");
		for (int i = 0; i < aliases.length; i++) {
			System.out.println(aliases[i]);
		}
	}
}
