import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);
	
		
		System.out.println(studentDAO.getStudentMaxID());
	}
}
