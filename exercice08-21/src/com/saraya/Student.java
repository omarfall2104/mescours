package com.saraya;

public class Student {
	private String name;
	private int rollNumber;
	
	public Student(String name, int rollNumber) {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getrollNumber() {
		return rollNumber;
	}
	public void setrollNumber(String rollNumber) {
		this.name = rollNumber;
	}
	public String toString() {
	return (rollNumber+ " "+ name);
	}
}