package com.rameshit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// Activate container.. by loading spring config files.

		ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
		
		System.out.println("Container Activated.....`");
		
		
		HelloBean bean = (HelloBean) context.getBean("helloBean");
		System.out.println("Message: " + bean.sayHello());

	}
}
