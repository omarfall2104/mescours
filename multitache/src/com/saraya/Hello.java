package com.saraya;
	
		public class Hello {
			public static void main(String[] args) throws InterruptedException {
			Runnable code = new Code();
			Thread thread = new Thread(code);
			thread.start();
			
			Runnable name = new Code();
			Thread thread1 = new Thread(name);
			//thread1.start();
			//thread1.sleep(3000);
			
			}
			
			
		

}
