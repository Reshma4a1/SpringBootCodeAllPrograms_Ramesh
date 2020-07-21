import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("application-context.xml");  
		
		StudentDAO studentDAO =context.getBean("studentDAO", StudentDAO.class);
		
		Student student = new Student();
		student.setSno(114);
		student.setSname("Ramesh");
		student.setSemail("Ramesh@gamil.com");
		student.setSmobile("777687");
		studentDAO.insertStudent(student);
	}

}
