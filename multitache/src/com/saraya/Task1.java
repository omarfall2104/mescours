package com.saraya;

public class Task1 extends Thread {
	public void run() { 
		Task1 task1 = new Task1();
		task1.start();
	
		
		System.out.println("Start Task1 From 100 - 199");
		for(int i = 100; i <= 199; i++) {
			System.out.print(i+ " ");
			//task1.join();
		
	}
	}
}

