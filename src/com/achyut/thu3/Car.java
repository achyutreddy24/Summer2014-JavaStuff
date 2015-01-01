package com.achyut.thu3;

public class Car {
	private int x; // location of the car
	public Car() {
		x = 0;
		
	}
	public int getX(){
		return x;
	}
	public void drive() {
		x= x +(int)( 40 * Math.random());
	}
}