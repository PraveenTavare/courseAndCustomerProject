package com.example.course.corejava;

// implementing Runnable interface 
public class ThreadClassExample1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 1 : " +i); // 0 1 .... 9
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
