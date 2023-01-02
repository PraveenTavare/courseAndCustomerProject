package com.example.course.corejava;

public class Employee2 {
	
	Long empid;
	String empName;
	String empAddress;
	Double empSalary;
	String gender;
	String dept;

	public Employee2() {
		
	}
	
	public Employee2(Long empid, String empName, String empAddress, Double empSalary, String gender, String dept) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
		this.gender = gender;
		this.dept = dept;
	}
	public Long getEmpid() {
		return empid;
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
	public String getGender() {
		return gender;
	}
	public String getDept() {
		return dept;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
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
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee2  [empid=" + empid + ", empName=" + empName + ", empAddress=" + empAddress + ", empSalary="
				+ empSalary + ", gender=" + gender + ", dept=" + dept + "]";
	}
	
	


}
