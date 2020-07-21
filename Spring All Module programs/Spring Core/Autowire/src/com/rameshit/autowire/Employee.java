package com.rameshit.autowire;


public class Employee {

	public Employee(Address address) {
		this.address=address;
		System.out.println("Employee param Constructor...");
	}

	private int eid;
	private String ename;
	private Address address;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
