package com.saraya;

import java.util.HashMap;

public class ExoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 10;
		int c = 20;
		HashMap<String, Integer> number = new HashMap<String, Integer>();
		number.put("a", 3);
		number.put("b", 10);
		number.put("c", 20);
		System.out.println(number);
		System.out.println(number.get("b"));
		System.out.println(number.containsKey("a"));
		System.out.println(number.containsValue(10));
		System.out.println(number.keySet());
		System.out.println(number);
		System.out.println(number.put("d", 40));
		System.out.println(number);
		
		

	}

}
