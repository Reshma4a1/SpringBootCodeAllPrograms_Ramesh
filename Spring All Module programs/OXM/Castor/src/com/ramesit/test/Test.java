package com.ramesit.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rameshit.converter.XMLConverter;
import com.rameshit.model.Employee;

public class Test {
	private static final String XML_FILE_NAME = "employee.xml";
	
	public static void main(String[] args) throws IOException {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		XMLConverter converter = (XMLConverter) appContext.getBean("XMLConverter");
		
//		Employee employee = new Employee();
//		employee.setFirstName("Ramesh");
//		employee.setLastName("Nara");
//		employee.setAge(30);
//		employee.setAddress("Hyderabad");
//		employee.setSalary(10000.00);
//		
//		System.out.println("Convert Object to XML!");
//		//from object to XML file
//		converter.convertFromObjectToXML(employee, XML_FILE_NAME);
//		System.out.println("Done \n");
//		
		System.out.println("Convert XML back to Object!");
		//from XML to object
		Employee  employee2= (Employee)converter.convertFromXMLToObject(XML_FILE_NAME);
		System.out.println(employee2.getFirstName());
		System.out.println(employee2.getLastName());
		System.out.println(employee2.getAddress());
		System.out.println(employee2.getAge());
		System.out.println(employee2.getSalary());
		System.out.println("Done");
		
	}
}