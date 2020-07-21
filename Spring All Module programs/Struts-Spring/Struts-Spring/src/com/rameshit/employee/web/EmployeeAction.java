package com.rameshit.employee.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import com.rameshit.employee.service.EmployeeService;
import com.rameshit.employee.vo.EmployeeVO;

@SuppressWarnings("deprecation")
public class EmployeeAction extends ActionSupport {
	public EmployeeAction() {
		System.out.println("EmployeeAction Constructor");
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("execute..... called....");
		
		 EmployeeForm employeeForm = (EmployeeForm) form;
		
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setEmpId(employeeForm.getEmpId());
		employeeVO.setName(employeeForm.getName());
		employeeVO.setAge(employeeForm.getAge());
		employeeVO.setSalary(employeeForm.getSalary());
		employeeVO.setAddress(employeeForm.getAddress());
		
		EmployeeService employeeService =
			(EmployeeService) getWebApplicationContext().getBean("employeeService");
		try {
			employeeService.insertEmployee(employeeVO);	
			return mapping.findForward("success");
		} catch (Exception e) {
			System.out.println(e);
			return mapping.findForward("failure");
		}
	}
}
