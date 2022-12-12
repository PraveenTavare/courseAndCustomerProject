package com.example.course.corejava;

public class ThreadClass1 implements Runnable {
	
	@Override
	public void run() {
		
		// Thread task
		for (int i = 0; i <= 10	; i++) {
			System.out.println("i = " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
