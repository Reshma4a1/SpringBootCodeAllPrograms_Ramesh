package com.rameshit.employee.dao;

import com.rameshit.employee.vo.EmployeeVO;

/**
 * EmployeeDAO class having all the DAO methods.
 * 
 * @author Ramesh
 * 
 */
public interface EmployeeDAO {
	/**
	 * It is used to insert the employee object using spring ORM
	 * 
	 * @param employeeVO
	 * @throws Exception
	 */
	void insertEmployee(EmployeeVO employeeVO) throws Exception;

	void UpdateEmployee(EmployeeVO employeeVO) throws Exception;

	void deleteEmployee(EmployeeVO employeeVO) throws Exception;

}
