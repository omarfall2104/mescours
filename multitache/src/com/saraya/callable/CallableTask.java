package com.saraya.callable;


import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {
	private String name;
	public CallableTask(String name) {
		this.name = name;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		return "Hi "+ name;
		
	}

}
