package com.example.course.corejava;

public class MainClass {

	public static void main(String[] args) {

		// Thread task created using Runnable interface
		ThreadClass1 th1 = new ThreadClass1();
		Thread thread = new Thread(th1);

		thread.start();
		
		// Thread task created using Thread class
		ThreadClass2 th2 = new ThreadClass2();
		th2.start();
	}

}
