package com.rameshit.spring;

public class HelloBean implements Hello {

	private String message;
	
	private HelloBean() {
		System.out.println("private constructor....");
	}

	
	public void setMessage(String message) {
		System.out.println("setMessage called....");
		this.message = message;
	}

	@Override
	public String sayHello() {
		System.out.println("sayHelloCalled...");
		return message;
	}
}