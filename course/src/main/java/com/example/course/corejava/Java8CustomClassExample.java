package com.example.course.corejava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;import org.springframework.http.ZeroCopyHttpOutputMessage;

public class Java8CustomClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee2> emp2List = new ArrayList<>();
		
		emp2List.add(new Employee2(1L, "Shankar", "Bangalore", 10000.00, "Male", "HR"));
		emp2List.add(new Employee2(10L, "Nisha", "Delhi", 15000.00, "Female", "HR"));
		emp2List.add(new Employee2(16L, "Sagar", "Bangalore", 10000.00, "Male", "IT"));
		emp2List.add(new Employee2(21L, "Amit", "Chennai", 30000.00, "Male", "IT"));
		emp2List.add(new Employee2(21L, "Chameli", "Kolkata", 20000.00, "Female", "Finance"));
		emp2List.add(new Employee2(26L, "Kunal", "Bekgaum", 12000.00, "Male", "Marketing"));

		System.out.println("Count of male and female employees in the organization below :: ");
		System.out.println(emp2List.stream().collect(Collectors.groupingBy(Employee2:: getGender, Collectors.counting())));
		// 		System.out.println(emp2List.stream().collect(Collectors.groupingBy( emp -> emp.getGender(), Collectors.counting())));
		
		System.out.println("Print the name of all departments in the organization below :: ");
	//	System.out.println(emp2List.stream().map( emp -> emp.getDept()).distinct().collect(Collectors.toList()));
		
		emp2List.stream().map(Employee2 :: getDept).distinct().forEach(System.out::println);
		
		System.out.println("Average salary of employees below :: ");
		
		System.out.println((emp2List.stream().collect(Collectors.averagingDouble(Employee2::getEmpSalary)).doubleValue()));
		
		System.out.println("Average salary of male and female employees below :: ");
		
		System.out.println(emp2List.stream().collect(Collectors.groupingBy(Employee2::getGender, Collectors.averagingDouble(Employee2::getEmpSalary))));
		
		System.out.println("details of highest paid employee in the organization  :: ");
		
		System.out.println(emp2List.stream().max(Comparator.comparing(Employee2::getEmpSalary)).get());
		
		System.out.println(emp2List.stream().sorted(Comparator.comparing(emp -> ((Employee2) emp).getEmpSalary()).reversed()).findAny().get());
		
		System.out.println(emp2List.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee2::getEmpSalary))));
		
		System.out.println("Get the names of all employees whose salary is above 20000");
		
		emp2List.stream().filter(emp -> emp.getEmpSalary() >= 20000).map(Employee2:: getEmpName).forEach(System.out::println);
		
		System.out.println(" Count the number of employees in each department");
		System.out.println(emp2List.stream().collect(Collectors.groupingBy(Employee2::getDept,Collectors.counting())));
		System.out.println(" average salary of each department ::");
		System.out.println(emp2List.stream().collect(Collectors.groupingBy(Employee2::getDept, Collectors.averagingDouble(Employee2::getEmpSalary))));
		
		System.out.println(" Employee whose is in IT and he has very less salary :: ");
		
		System.out.println(emp2List.stream().filter(emp -> emp.getDept().equalsIgnoreCase("IT")).min(Comparator.comparingDouble(Employee2::getEmpSalary)));
		
		
		System.out.println("counting male and female employees are there in HR" );
		System.out.println(emp2List.stream().filter(emp -> emp.getDept() == "HR").collect(Collectors.groupingBy(Employee2:: getGender)));
		System.out.println();
		System.out.println("the names of all employees in each department ::");
		
		System.out.println(emp2List.stream().collect(Collectors.groupingBy(Employee2::getDept)).entrySet());
		System.out.println("average salary of the whole organization");
		System.out.println(emp2List.stream().collect(Collectors.summarizingDouble(Employee2::getEmpSalary)));
		
	}

}
