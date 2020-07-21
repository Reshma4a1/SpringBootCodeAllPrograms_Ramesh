package com.rameshit.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("inheritance.xml");
		
		Car parentCar = context.getBean("parentCar", Car.class);
		
		parentCar.showCarDetails();
	}
}
