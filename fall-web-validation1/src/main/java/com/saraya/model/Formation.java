package com.saraya.model;
public class Formation {
	private String name;
	
	public Formation(String name) {
		this.name = name;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {

		return String.format("Fomation [name=%s]", name);

	}
	

}
