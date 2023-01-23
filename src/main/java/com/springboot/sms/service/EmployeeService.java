package com.springboot.sms.service;

import java.util.List;

import com.springboot.sms.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(Integer id);
	
	void deleteEmployeeById(Integer id);
}
