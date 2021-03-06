package com.saraya.callable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterWithCallAny {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(5);
		List<CallableTask> callableList = List.of(new CallableTask("Mouhamed"),
				new CallableTask("Fall"), new CallableTask("Omar"),
				new CallableTask("Serigne"));
		String kande = es.invokeAny(callableList);
			System.out.println(kande);
		
		es.shutdown();

	}

}
