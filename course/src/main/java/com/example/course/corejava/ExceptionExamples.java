package com.example.course.corejava;

public class ExceptionExamples {
	
	public static void main(String[] args) {
		try {
			
			int age = 10;
			String name = "Praveen";
			System.out.println(name + " is " +age);
		} catch(ClassCastException e1) {
			System.out.println("Error 1");
		}
		catch (Exception e) {
			System.out.println("Error 2");
		} 
		
	}

}
