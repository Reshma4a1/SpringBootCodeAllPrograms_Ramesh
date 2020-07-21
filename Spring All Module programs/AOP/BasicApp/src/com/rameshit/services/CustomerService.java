package com.rameshit.services;


public class CustomerService {

	public CustomerService() {
		System.out.println("CustomerService constructor...");
	}

	private String name;
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	// business method
	public void printName() {
		System.out.println("Customer name : " + this.name);
	}

	// business method
	public void printURL() {
		System.out.println("Customer website : " + this.url);
	}

	public void printThrowException() {
		throw new IllegalArgumentException("Hey I am throwing.....");
	}
	
	
	public void m1() {
		System.out.println("m1 method...");
	}
	
	
	public void m2() {
		System.out.println("m2 method...");
	}
	

	public void m3() {
		System.out.println("m3 method...");
	}
	

	

}
