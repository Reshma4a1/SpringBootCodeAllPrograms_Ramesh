package com.rameshit.employee.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rameshit.employee.dao.EmployeeDAO;
import com.rameshit.employee.vo.EmployeeVO;

public class EmployeeDAOImpl extends HibernateDaoSupport implements EmployeeDAO {

	public void insertEmployee(EmployeeVO employeeVO) throws Exception {
		getHibernateTemplate().save(employeeVO);
	}

	@Override
	public void UpdateEmployee(EmployeeVO employeeVO) throws Exception {
		getHibernateTemplate().update(employeeVO);

	}

	@Override
	public void deleteEmployee(EmployeeVO employeeVO) throws Exception {
		getHibernateTemplate().delete(employeeVO);

	}
}
