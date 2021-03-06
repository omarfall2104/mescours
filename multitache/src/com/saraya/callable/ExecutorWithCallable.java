package com.saraya.callable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorWithCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(1);
		Future<String> welcomFuture = es.submit(new CallableTask("Mouhamed"));
		String newWelcon = welcomFuture.get();
		System.out.println(newWelcon);
		es.shutdown();
	}

}
