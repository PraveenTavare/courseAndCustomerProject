package com.example.course.corejava;

public class MainClass2 {

	public static void main(String[] args) {
		
		ImmutableStudentClass immutObj = new ImmutableStudentClass(1, "Praveen", "Bangalore");
		
		System.out.println(immutObj.getStdId());

		System.out.println(immutObj.getName());

		System.out.println(immutObj.getAddress());
		
	}

}
