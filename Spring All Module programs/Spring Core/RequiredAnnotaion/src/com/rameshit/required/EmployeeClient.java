package com.rameshit.required;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rameshit/required/context.xml");
		
		Employee employee = context.getBean("employee", Employee.class);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAddress());
		
		List<String> l = new ArrayList<String>();
		
	}

}
