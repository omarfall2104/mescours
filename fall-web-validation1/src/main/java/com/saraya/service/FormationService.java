package com.saraya.service;
import java.util.ArrayList;
import java.util.List;

import com.saraya.model.Formation;

public class FormationService {
	
	
	
	private static  List<Formation> formation = new ArrayList<Formation>();
	 static {
		 
		 formation.add(new Formation("Infographie"));
		 formation.add(new Formation("Bureautique"));


		
	}
	 public List<Formation> getAllFormation() {
			return formation;
		}
	 public void addFormation(Formation formations) {
		 formation.add(formations);
		
	 }
	}

