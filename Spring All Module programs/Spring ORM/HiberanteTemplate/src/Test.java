import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);

	/*	Student student = new Student();
		student.setSno(106);
		student.setSname("Amit");
		student.setSemail("amit@durga.com");
		student.setSmobile("66666");
		
		studentDAO.insertStudent(student);
	
	*/		
	
	List<Student> studentsList = studentDAO.getStudents();
	
	for (Student student : studentsList) {
		System.out.println(student.getSno());
		System.out.println(student.getSname());
		System.out.println(student.getSemail());
		System.out.println(student.getSmobile());
		System.out.println("------------------------");
	}
	
	}

}
