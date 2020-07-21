package com.amarshi.constructor.injection;

public class EmployeeBean {

	private int age;
	private String name;
	private long salary;
	private String emailId;

	EmployeeBean(Integer age, String name) {
		this.age = age;
		this.name = name;
	}

	public EmployeeBean(String name, String emailId) {
		this.emailId = emailId;
		this.name = name;
	}

	EmployeeBean(Long salary, String name) {
		this.salary = salary;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public long getSalary() {
		return salary;
	}

	public String getEmailId() {
		return emailId;
	}

}
