package com.saraya;

import java.util.HashMap;

public class ExoHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> num = new HashMap<String, Integer>();
		/*num.put("Onar", 12);
		num.put("pape", 13);
		num.put("khady", 21);
		num.put("Famara", 1210);
		System.out.println(num);
		System.out.println(num.get("Famara"));
		System.out.println(num.size());
		System.out.println(num.containsKey("pape"));
		System.out.println(num.replace("pape", 125));
		System.out.println(num);*/
		num.stream().forEach(e -> System.out.prinln(e));
	}

}
