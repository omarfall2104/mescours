package com.saraya;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class NameListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<NameList> names = new LinkedList<>();
		names.add(new NameList("Camara"));
		names.add(new NameList("Amadou"));
		names.add(new NameList("Serigne"));
		names.add(new NameList("Abdoulaye"));
		
		//names.stream().forEach(a -> System.out.print(a+ " "));

		
		for(int i=0; i< names.size(); i++) {
			System.out.print(names.get(i)+ " ");
		}
		System.out.println("\n"+ "====================================");
		for(int i = 0; i< names.size(); i++) {
			if(i==0 || i ==names.size()-1) {
			names.remove(i);
			System.out.println(names);
		
		}
			//Iterator<NameList> itnames = names.iterator();
			
	}
		
	}
}

