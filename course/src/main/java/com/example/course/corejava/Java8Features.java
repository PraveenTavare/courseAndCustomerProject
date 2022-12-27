package com.example.course.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Features {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {20,70,1000,20,50,6,1, 500};
		
		System.out.println(Arrays.stream(arr).boxed().sorted().mapToInt(i->i).summaryStatistics().getMax());
		
		// to find the maximum number in an array
		System.out.println("MAX number: " + Arrays.stream(arr).max());
		System.out.println("MIN number: " + Arrays.stream(arr).min());
		System.out.println("SUM of array : " +Arrays.stream(arr).sum());
		
		Arrays.stream(arr).boxed().sorted().forEach( n -> System.out.println(n));
		System.out.println();
		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("Number of elements in an array : " + Arrays.stream(arr).count());
		System.out.println("Average of  an array : " + Arrays.stream(arr).average());
		
		List<Integer> intList = Arrays.asList(800, 1, 25, 40, 50, 100, 600);
		
		System.out.println("Sorted List :  " +intList.stream().sorted().collect(Collectors.toList()));
		
		intList.stream().sorted(Collections.reverseOrder()).forEach(n -> System.out.println(n));
		System.out.println();
		intList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		System.out.println();
		System.out.println("Reverse Sorted List :  " +intList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		
		System.out.println("MAX number in a list: " +intList.stream().max((a,b) -> a.compareTo(b)).get());
		System.out.println("MIN number in a list: " +intList.stream().max((a,b) -> b.compareTo(a)).get());
		System.out.println("MIN number in a list: " +intList.stream().min((a,b) -> a.compareTo(b)).get());
		System.out.println("MAX number in a list: " +intList.stream().min((a,b) -> b.compareTo(a)).get());
		
		
		System.out.println("2nd MAX number in a list :" +intList.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findAny().get());
		System.out.println("3rd Min number in a list :" +intList.stream().sorted().distinct().skip(2).limit(3).findAny().get());
		
		
		System.out.println("Even numbers in a list :" +intList.stream().filter(i -> i%2 == 0).collect(Collectors.toList()));
		System.out.println("ODD numbers in a list :" +intList.stream().filter(i -> i%2 == 1).collect(Collectors.toList()));
		
		System.out.println("Sum of all the Even numbers in a list :" +intList.stream().filter(i -> i%2 == 0).reduce(0, Integer::sum));
		System.out.println("Sum of squares of all the odd numbers in a list :" +intList.stream().filter(i -> i%2 == 1).map(i->i*i).reduce(0, Integer::sum));


		// Sorting without using java 8, asc sorting
		
		System.out.println(Arrays.toString(sortArray(arr)));
		
		String  str = "Ppraveen";
		str = str.toLowerCase();
		System.out.println(Arrays.stream(str.split("")).map(String::toLowerCase).sorted().
				collect(Collectors.groupingBy( s->s, LinkedHashMap::new, Collectors.counting())));
		
		// First unique character in a String
		
		char[] charCount = new char[256];
		int index = -1;
		
		for(int i = 0; i < str.length() ; i++) {
			charCount[str.charAt(i)]++;
		}
		
		for(int i = 0; i < str.length() ; i++) {
			if(charCount[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}
		System.out.println((index == -1) ? "String is null" : "First non-repeating character is : " +str.charAt(index));
		
		// For Object classes
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1L, "Shankar", "Bangalore", 10000.00));
		empList.add(new Employee(11L, "Pankaj", "Bangalore", 20000.00));
		empList.add(new Employee(20L, "Vipin", "Kolkata", 50000.00));

		empList.add(new Employee(12L, "Anil", "Delhi", 30000.00));
		empList.add(new Employee(21L, "Manoj", "Mumbai", 40000.00));
		
		empList.forEach(n -> System.out.println(n.empid+ ", " +n.empName+ ", " +n.empAddress+ ", " +n.empSalary));
		
		
		empList.stream().filter( emp -> emp.getEmpAddress().equalsIgnoreCase("bangalore")).forEach(e -> System.out.println(e));
		System.out.println("Employee Belongs to Bangalore" +empList.stream().
				filter( emp -> emp.getEmpAddress().equalsIgnoreCase("bangalore")).collect(Collectors.toList()));

		empList.stream().filter(emp -> "bangalore".equalsIgnoreCase(emp.getEmpAddress())).
			sorted(Comparator.comparing(Employee::getEmpSalary).reversed()).forEach(System.out::println);
		
		System.out.println("Employee with Min salary:  " +empList.stream().min(Comparator.comparing(Employee::getEmpSalary)).get());
		empList.stream().max(Comparator.comparing(Employee:: getEmpSalary)).ifPresent(e -> System.out.println(e));
		System.out.println();
		empList.stream().sorted(Comparator.comparing(Employee::getEmpid).reversed()).sorted(Comparator.comparing(Employee::getEmpSalary)).forEach(System.out::println);
		System.out.println();
		empList.stream().filter( emp -> emp.getEmpid() > 10L && emp.getEmpSalary() > 20000.00).forEach(System.out::println);
		
		empList.stream().filter( emp -> emp.getEmpid() > 10L && emp.getEmpSalary() > 20000.00).
			map(emp -> emp.getEmpSalary() + 1000.00).forEach(System.out::println);
	}
	
	public static int[] sortArray(int[] arr) {	
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] < arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i = -1;
			}
			
		}
		return arr;
	}

}
