package com.rameshit.connection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionClient {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/rameshit/connection/database.xml");
		
		ConnectionUtil connectionUtil = context.getBean("connectionUtil", ConnectionUtil.class);
		connectionUtil.getConnection();
	}

}
