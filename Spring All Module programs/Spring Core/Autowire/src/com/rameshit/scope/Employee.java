package com.rameshit.scope;

public class Employee {

	private int id;
	private String name;

	public Employee() {
		System.out.println("Employee default constructor..");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
