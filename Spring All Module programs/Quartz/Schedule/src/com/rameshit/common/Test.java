package com.rameshit.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
		new ClassPathXmlApplicationContext("application-context.xml");
	}
}