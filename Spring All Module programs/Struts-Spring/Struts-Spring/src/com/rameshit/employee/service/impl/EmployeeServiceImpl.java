package com.rameshit.employee.service.impl;

import com.rameshit.employee.dao.EmployeeDAO;
import com.rameshit.employee.service.EmployeeService;
import com.rameshit.employee.vo.EmployeeVO;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public void insertEmployee(EmployeeVO employeeVO) throws Exception {

		System.out.println("insertEmployee in EmployeeService called.");
		//b.logic
		employeeDAO.insertEmployee(employeeVO);
	}
}
