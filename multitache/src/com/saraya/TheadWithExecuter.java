package com.saraya;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheadWithExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		es.execute(new task());
		es.execute(new Thread(new task1));

	}

}
