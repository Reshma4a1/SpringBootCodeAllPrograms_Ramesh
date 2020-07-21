package com.rameshit.constructor;

public class EmployeeBean {

	private String name;
	private String email;

	public EmployeeBean(String name, String email) {
		this.name = name;
		this.email = email;
		System.out.println("EmployeeBean param constructor...");
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
