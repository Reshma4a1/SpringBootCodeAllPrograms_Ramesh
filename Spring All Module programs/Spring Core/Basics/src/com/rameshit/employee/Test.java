package com.rameshit.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {

		//Activate the container
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rameshit/employee/employee-constructor.xml");
		
		System.out.println("Container Activated.....");
		
		Employee employee = context.getBean("employee", Employee.class);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
		System.out.println(employee.getSalary());
		
		System.out.println("Getting address object from the Employee");
		Address address = employee.getAddress();
		
		System.out.println(address.getHouseno());
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.getZipcode());
	}
}
