package com.rameshit.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycle.xml");
		HelloBean bean = context.getBean("helloBean", HelloBean.class);
		System.out.println(bean.getMessage());
		context.registerShutdownHook();
	}
}
