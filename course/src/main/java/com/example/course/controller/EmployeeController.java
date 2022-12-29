package com.example.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.Employee;
import com.example.course.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	// to test this api - http://localhost:9090/test
	
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String test() {
		return "Just testing !!";
	}

	// to create new resource
	// To test this api - http://localhost:9090/addEmployee
	
	
	@PostMapping(value = "/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {

		return empService.addEmployee(employee);
	}

	// to update the existing resource based on id
	// To test this api - http://localhost:9090/updateEmployee/4
	@PutMapping("/updateEmployee/{empId}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("empId") Long empId) {

		return empService.updateEmployee(employee, empId);
	}

	// to get all the available resources
	// To test this api -http://localhost:9090/getAllEmployees
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees() {

		List<Employee> dbEmpList = empService.getAllEmployees();
		return new ResponseEntity<>(dbEmpList, HttpStatus.OK);
	}
	
	// to get a resource based on Id
	// to test this api - http://localhost:9090/getEmployeeById/5
	
	@GetMapping("/getEmployeeById/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long empId) {

		Employee dbEmp = empService.getEmployeeById(empId);
		return new ResponseEntity<>(dbEmp, HttpStatus.OK);
	}

	// To delete a resource based on Id
	//	To test this api - http://localhost:9090/deleteById/5
	
	@DeleteMapping("/deleteById/{empId}")
	public ResponseEntity<List<Employee>> deleteAnEmployee(@PathVariable Long empId) {

		empService.deleteAnEmployee(empId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	// For partial update
	// To test thid api -- http://localhost:9090/updateEmpUsingPatch/4/Noida

	@PatchMapping(value = "/updateEmpUsingPatch/{empId}/{empAddress}")
	public ResponseEntity<Employee> updateEmpUsingPatch(@PathVariable String empAddress,
			@PathVariable("empId") Long empId) {
		try {
			return new ResponseEntity<>(empService.updateEmpUsingPatch(empAddress, empId), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Employee>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
