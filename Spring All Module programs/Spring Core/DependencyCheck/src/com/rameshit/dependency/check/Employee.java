package com.rameshit.dependency.check;

import org.springframework.beans.factory.annotation.Required;


public class Employee {

	private int id; // simple property
	private String name; // simple property
	private Address address; // Object property
	
	public Employee() {
		System.out.println("Employee default constructor");
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
