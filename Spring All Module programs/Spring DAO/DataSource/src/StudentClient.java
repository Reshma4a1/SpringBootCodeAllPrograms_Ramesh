import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);
		
		Student student = new Student();
		student.setSno(106);
		student.setSname("Sandeep");
		student.setSemail("sandeep@yahoo.com");
		student.setSmobile("7777777");
		
		studentDAO.insertSudent(student);
		
	}
	
}
