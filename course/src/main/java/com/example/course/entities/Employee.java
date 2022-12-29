package com.example.course.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee" , schema = "test")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name  = "emp_Id")
	private Long empId;
	
	@Column(name = "emp_Name")
	private String empName;
	
	@Column(name = "emp_Address")
	private String empAddress;
	
	@Column(name = "emp_Gender")
	private Character gender;
	
	@Column(name = "emp_Salary")
	private Double empSalary;

	public Long getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee :: [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", gender=" + gender
				+ ", empSalary=" + empSalary + "]";
	}
	
	

}
