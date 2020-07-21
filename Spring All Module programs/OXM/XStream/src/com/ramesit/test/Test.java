package com.ramesit.test;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;

import com.rameshit.model.Employee;

public class Test {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
		Marshaller marshaller = (Marshaller) context.getBean("xstreamMarshallerBean");

		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Kazi");
		employee.setSalary(100000);

		marshaller.marshal(employee, new StreamResult(new FileWriter(
				"employee.xml")));

		System.out.println("XML Created Sucessfully......");
	}
}