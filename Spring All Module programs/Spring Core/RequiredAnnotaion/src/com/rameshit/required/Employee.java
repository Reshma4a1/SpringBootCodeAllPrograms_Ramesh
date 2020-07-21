package com.rameshit.required;

import org.springframework.beans.factory.annotation.Required;


public class Employee {
	
	private int id;
	private String name;
	
	private Address address;

	public Employee() {
		System.out.println("Employee default constructor");
	}

	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	
	public Address getAddress() {
		return address;
	}
	@Required
	public void setAddress(Address address) {
		this.address = address;
	}

}
