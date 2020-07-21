import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);

		
		
		 Student student = new Student();
		 student.setSno(226);
		 student.setSname("Serge");
		 student.setSemail("serge@gmail.com");
		 student.setSmobile("8888");
		 
		 studentDAO.insertStudent(student);

		// studentDAO.insertStudentWithPstmt(student);

	}
}
