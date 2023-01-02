package com.example.course.corejava;

// implementing Runnable interface 
// 2nd Thread
public class ThreadClassExample2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread 2 : "+ i); // 1 .... 10
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
