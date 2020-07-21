package com.rameshit.services;


public class CustomerServiceImpl implements CustomerService {

	public void addCustomer(){
		System.out.println("addCustomer() in Target object ");
	}
	
	public String addCustomerReturnValue(){
		System.out.println("addCustomerReturnValue() in Target object ");
		return "Ramesh";
	}
	
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException()  in Target object ");
		throw new Exception("Generic Error");
	}
	
	public void addCustomerAround(String name){
		System.out.println("addCustomerAround()  in Target object, args : " + name);
	}
}