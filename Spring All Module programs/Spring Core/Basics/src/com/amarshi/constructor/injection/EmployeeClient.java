package com.amarshi.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/amarshi/constructor/injection/employee-constructor.xml");
		
		EmployeeBean bean6 = context.getBean("employeeBean",EmployeeBean.class);
        System.out.println("age:"+ bean6.getAge());
        System.out.println("name:"+ bean6.getName());

	}

}
