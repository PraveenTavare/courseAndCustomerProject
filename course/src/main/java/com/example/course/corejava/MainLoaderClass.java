package com.example.course.corejava;

// MultiThreading Example
public class MainLoaderClass {

	public static void main(String[] args) {
		
		// 2 Threads running simulteniously - making maximum CPU Utilization
		// Best Example - Internet download manager in IE
		// thread t1, t2, t3 ....tn running , 
		ThreadClassExample1 th1 = new ThreadClassExample1();
		Thread t1 = new Thread(th1);
		t1.start();
		
		ThreadClassExample2 th2 = new ThreadClassExample2();
		Thread t2 = new Thread(th2);
		t2.start();
		
		// Calling thread t3, created using Extending Thread class
		ThreadClassExample3 th3 = new ThreadClassExample3();
		th3.start();

		

	}

}
