package com.example.course.corejava;

public class ThreadLambdaExample {

	public static void main(String[] args) {
		
		// Using Lambda interface
		Runnable r = () -> {
					System.out.println("Using Lambda interface implementation..");
			};
			
		Thread t = new Thread(r);
		t.start();

	}

}
