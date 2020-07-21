import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);
		
//		long count = studentDAO.getStudentsCount();
//		System.out.println("The No of students are: " + count);
		
		
//		System.out.println("The Student Max ID: " + studentDAO.getMaxStudentID());
		
//		System.out.println("The Student Name is: " + studentDAO.getStudentName(103));
		
		
//		Student student = studentDAO.getStudent(999);
//		
//		System.out.println(student.getSno());
//		System.out.println(student.getSname());
//		System.out.println(student.getSemail());
//		System.out.println(student.getSmobile());
		
		
//		Map<String, Object> map = studentDAO.getStudentWithColumn(101);
//		
//		System.out.println(map);
		
//		List<Map<String, Object>> list = studentDAO.getStudentListWithColumn();
//		
//		System.out.println(list);
//		
		
		List<String> list = studentDAO.getStudentEmails();
		
		System.out.println(list);
		
	}
	
	
	
	
	
}
