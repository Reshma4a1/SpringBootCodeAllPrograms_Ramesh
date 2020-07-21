package com.rameshit.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rameshit/collection/collection-constructor.xml");
		
		Student student = context.getBean("student", Student.class);
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourses());
		
		System.out.println(student.getFeeDetails());
		System.out.println(student.getMobileNos());
		System.out.println(student.getProperties());
	}
}
