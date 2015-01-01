package com.achyut.thu2;

public class Employee {
	private double salary;
	
	public Employee(double a){
		salary = a;
	}
	
	public void increase(double a) {
		if(a >= 0) {
			salary = salary + a;
		}
		
		
	}
	
	public double getPay() {
		return salary;
	}
	
	
}
