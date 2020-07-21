package com.rameshit.employee.web;

import org.apache.struts.action.ActionForm;

public class EmployeeForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeForm() {
		System.out.println("EmployeeForm Constructor");
	}

	private String empId;
	private String name;
	private String age;
	private String salary;
	private String address;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
