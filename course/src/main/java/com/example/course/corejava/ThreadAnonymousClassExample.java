package com.example.course.corejava;

public class ThreadAnonymousClassExample {

	public static void main(String[] args) {

		Runnable r = new Runnable() {

			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};
	
	Thread t = new Thread(r);
	t.start();
	
}
}
