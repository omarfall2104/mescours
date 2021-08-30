package com.saraya.callable;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterWithCallList {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(1);
		List<CallableTask> c = List.of(new CallableTask("Mouhamed"),
				new CallableTask("Fall"), new CallableTask("Omar"),
				new CallableTask("Serigne"));
		List<Future<String>> kande = es.invokeAll(callableList);
		for(Future<String> maman : kande) {
			System.out.println(maman.get());
		}
		es.shutdown();

	}

}
