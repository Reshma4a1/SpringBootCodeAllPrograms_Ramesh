package com.rameshit.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");

		CustomerService customer = appContext.getBean("customerServiceProxy", CustomerService.class);
		System.out.println("*************************");
		customer.printName();
		System.out.println("*************************");
		customer.printURL();
		System.out.println("*************************");
		try {
			customer.printThrowException();
		
		} catch (Exception e) {
		}
		
		
		System.out.println("------------------------------");
		
		customer.m1();
		customer.m2();
		customer.m3();
	}

}
