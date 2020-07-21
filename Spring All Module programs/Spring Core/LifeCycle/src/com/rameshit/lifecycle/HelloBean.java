package com.rameshit.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean {

	private String message;

	public HelloBean() {
		System.out.println("HelloBean constructor...");
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("setMessage");
	}

	public String getMessage() {
		return message;
	}
	
	//init method..
	public void myInit() {
		System.out.println("myInit called..");
	}
	//destroy method..
	public void myDestroy() {
		System.out.println("myDestroy called.");
	}
}
