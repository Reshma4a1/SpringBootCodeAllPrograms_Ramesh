package com.rameshit.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rameshit/autowire/autowire.xml");

		Employee employee = context.getBean("employee", Employee.class);

		System.out.println(employee.getEid());
		System.out.println(employee.getEname());

		Address address = employee.getAddress();
		System.out.println(address);
		if (address != null) {
			System.out.println(address.getHouseNo());
			System.out.println(address.getCity());
			System.out.println(address.getState());
			System.out.println(address.getPincode());
	
		}
	}
}
