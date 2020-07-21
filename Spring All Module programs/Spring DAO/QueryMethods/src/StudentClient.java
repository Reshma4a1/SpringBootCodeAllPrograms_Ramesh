import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);

		Map map = studentDAO.getStudentsWithSubject();
	
		System.out.println(map);
		
//		List<Student> studentsList = studentDAO.getStudents();
//
//		for (Student student : studentsList) {
//			System.out.print(student.getSno() + "\t");
//			System.out.print(student.getSname() + "\t");
//			System.out.print(student.getSemail() + "\t");
//			System.out.println(student.getSmobile() + "\t");
//		}
		
	}
}
