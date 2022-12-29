package com.example.course.services;

import java.util.List;

import com.example.course.entities.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee, Long empId);

	List<Employee> getAllEmployees();

	void deleteAnEmployee(Long empId);

	Employee getEmployeeById(Long id);

	Employee updateEmpUsingPatch(String empAddress, Long empId);

}
