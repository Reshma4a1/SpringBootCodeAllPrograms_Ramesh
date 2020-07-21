package com.ramesit.test;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;

import com.rameshit.model.Employee;

public class Test {
	private static final String XML_FILE_NAME = "employee.xml";

	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
		Marshaller marshaller = (Marshaller) context.getBean("jaxbMarshallerBean");

		Employee employee = new Employee();
		employee.setId(103);
		employee.setName("Ramesh");
		employee.setSalary(100000);
		employee.setAge((byte)30);

		marshaller.marshal(employee, new StreamResult(new FileWriter(
				XML_FILE_NAME)));

		System.out.println("XML Created Sucessfully");
	}
}