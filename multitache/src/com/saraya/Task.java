package com.saraya;

public class Task extends Thread{
	private int number;
	public Task(int number) {
		
	}
	public void run() {
		System.out.println("task" +number +"stated");
		for(int i = number*100; i<= number*100+99; i++ ) {
			System.out.print(i + " ");
		}
		System.out.println("\n task" + number + "has ended");
	}

}
