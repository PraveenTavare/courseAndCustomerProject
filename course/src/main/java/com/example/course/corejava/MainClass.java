package com.example.course.corejava;

public class MainClass {

	public static void main(String[] args) {

		ThreadClass1 th1 = new ThreadClass1();
		Thread thread = new Thread(th1);

		thread.start();
	}

}
