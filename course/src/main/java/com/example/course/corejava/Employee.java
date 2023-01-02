package com.example.course.corejava;

import java.io.Serializable;
// Serializable - to convert state of Object into byte stream and Vice-versa
public class Employee implements Serializable {

	// Serial version Id added to know that same object to be deserialized -
	// to verify the sender and receiver of serialized object
	private static final long serialVersionUID = 3058532170216532674L;
	
	static Long empid;
	transient String empName;
	String empAddress;
	Double empSalary;
	
	public Employee() {
		super();
	}
	
	public Employee(Long empid, String empName, String empAddress, Double empSalary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
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

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empAddress=" + empAddress + ", empSalary="
				+ empSalary + "]";
	}

}
