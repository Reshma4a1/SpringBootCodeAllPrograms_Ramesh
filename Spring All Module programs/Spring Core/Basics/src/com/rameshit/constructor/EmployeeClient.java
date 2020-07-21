package com.rameshit.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rameshit/constructor/employee-constructor.xml");
		
		EmployeeBean employeeBean = context.getBean("employeeBean", EmployeeBean.class);
		
		System.out.println("Name: " + employeeBean.getName());
		System.out.println("Email: " + employeeBean.getEmail());
	}

}
