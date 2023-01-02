package com.example.course.corejava;

// Extending Thread class
public class ThreadClassExample3 extends Thread {
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("T3 Thread " + i);
		}
	}

}
