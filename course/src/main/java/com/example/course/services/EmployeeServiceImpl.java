package com.example.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.Repository.EmployeeRepository;
import com.example.course.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee, Long empId) {

		// This below code will create a new resources in DB if not exists

		return empRepository.findById(empId).map(emp -> {

			emp.setEmpAddress(employee.getEmpAddress());
			emp.setEmpName(employee.getEmpName());
			emp.setGender(employee.getGender());
			emp.setEmpSalary(employee.getEmpSalary());

			return empRepository.save(emp);

		}).orElseGet(() -> {

			employee.setEmpId(empId);
			return empRepository.save(employee);
		});

		// Use to update the existing resources if id exits in DB

		/*
		 * Employee empDBObject = empRepository.findById(empId).get();
		 * System.out.println("DB Employee Object " + empDBObject);
		 * 
		 * empDBObject.setEmpAddress(employee.getEmpAddress());
		 * empDBObject.setEmpName(employee.getEmpName());
		 * empDBObject.setGender(employee.getGender());
		 * empDBObject.setEmpSalary(employee.getEmpSalary());
		 * 
		 * return empRepository.save(empDBObject);
		 */
	}

	// to get all employee details
	public List<Employee> getAllEmployees() {
		return empRepository.findAll();
	}

	// to delete a employee
	@Override
	public void deleteAnEmployee(Long empId) {
		empRepository.deleteById(empId);
	}

	// to get a employee details
	public Employee getEmployeeById(Long id) {
		return empRepository.findById(id).get();
	}

	@Override
	public Employee updateEmpUsingPatch(String empAddress, Long empId) {

		Employee dbEmp = empRepository.findById(empId).get();
		dbEmp.setEmpAddress(empAddress);

		return empRepository.save(dbEmp);

	}
}
