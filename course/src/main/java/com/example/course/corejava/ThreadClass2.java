package com.example.course.corejava;

public class ThreadClass2 extends Thread {

	public void run() {
	
		for (int i = 0; i <= 10	; i++) { 
			System.out.println(i*5);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
