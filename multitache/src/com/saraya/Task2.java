package com.saraya;

public class Task2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Task2 task2= new Task2();
		task2.start();
		
		System.out.println("Start Task2 From 100 - 199");
		for(int i = 100; i <= 199; i++) {
			System.out.print(i+ " ");
		
	}

}
}
