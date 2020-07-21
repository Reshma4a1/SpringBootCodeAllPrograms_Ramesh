package com.rameshit.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/rameshit/scope/scope.xml");
		System.out.println("container Activated.....");
		
		Employee employee = context.getBean("employee", Employee.class);
		Employee employee2 = context.getBean("employee", Employee.class);
		Employee employee3 = context.getBean("employee", Employee.class);
		
		System.out.println(employee);
		System.out.println(employee2);
		System.out.println(employee3);
		
		}
}
