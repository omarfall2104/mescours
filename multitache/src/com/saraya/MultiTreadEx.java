package com.saraya;

public class MultiTreadEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Task1 task1 = new Task1();
		task1.start();
	
		
		System.out.println("Start Task1 From 100 - 199");
		for(int i = 100; i <= 199; i++) {
			System.out.print(i+ " ");
			task1.join();
		}
		System.out.println("End of Task1");
		
		System.out.println("Start Task2 From 200 - 299");
		for(int i = 200; i <= 299; i++) {
			System.out.println(i+ " ");
		
		}
		System.out.println("End of Task2");
		
System.out.println("End of Task1");
		
		System.out.println("Start Task3 From 300 - 399");
		for(int i = 300; i <= 399; i++) {
			System.out.println(i+ " ");
	}

}
}
