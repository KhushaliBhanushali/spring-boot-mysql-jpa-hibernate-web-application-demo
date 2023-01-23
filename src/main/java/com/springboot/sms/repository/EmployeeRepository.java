package com.springboot.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.sms.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
