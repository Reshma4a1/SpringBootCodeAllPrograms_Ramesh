package com.rameshit.employee;

public class Address {

	public Address() {
		System.out.println("Address Default Constructor..");
	}

	private String houseno;
	private String city;
	private String state;
	private String zipcode;
	
	public Address(String houseno, String city, String state, String zipcode) {
		super();
		this.houseno = houseno;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		System.out.println("Address Param Constructor....");
	}

	public String getHouseno() {
		return houseno;
	}

	public void setHouseno(String houseno) {
		System.out.println("setHouseno called...");
		this.houseno = houseno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
