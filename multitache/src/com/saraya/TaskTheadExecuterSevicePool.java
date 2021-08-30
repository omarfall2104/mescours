package com.saraya;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTheadExecuterSevicePool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(3);
		es.execute(new Task(1));
		es.execute(new Task(2));
		es.execute(new Task(3));
		es.execute(new Task(4));
		
		es.shutdown();

	}

}
