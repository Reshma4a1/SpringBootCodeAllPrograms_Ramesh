package com.rameshit.employee;

public class Employee {

	public Employee() {
		System.out.println("Employee Default Constructor...");
	}

	private long empId;
	private String name;
	private byte age;
	private double salary;
	private Address address;
	

	public Employee(long empId, String name, byte age, double salary, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		System.out.println("Employee Param Constrtuctor..");
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		System.out.println("setEmpId called...");
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
