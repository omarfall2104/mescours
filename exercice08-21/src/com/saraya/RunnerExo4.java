package com.saraya;

import java.util.LinkedHashSet;

public class RunnerExo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Exercice4> iknb = new LinkedHashSet<Exercice4>();
		iknb.add(new Exercice4(10));
		iknb.add(new Exercice4(5));
		iknb.add(new Exercice4(7));
		iknb.add(new Exercice4(24));
		iknb.add(new Exercice4(41));
		
		iknb.stream().forEach(e -> System.out.print(e));
	}
	
	

}
