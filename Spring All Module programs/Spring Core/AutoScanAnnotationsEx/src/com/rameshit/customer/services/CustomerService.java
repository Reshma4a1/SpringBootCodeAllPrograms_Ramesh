package com.rameshit.customer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rameshit.customer.dao.CustomerDAO;

//@Component
@Service
public class CustomerService 
{
	@Autowired
	private CustomerDAO customerDAO;
	
	//business method, it is used to access DAO method

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}
		
}
