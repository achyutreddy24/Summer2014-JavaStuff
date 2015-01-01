package com.achyut.thu3;

public class CarRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		System.out.println("Car 1 = " + c1.getX() + "   Car2 = " + c2.getX());
		
		while(!(c1.getX()>200) || !(c1.getX()>200)) {
			c1.drive();
			c2.drive();
			System.out.println("Car 1 = " + c1.getX() + "   Car2 = " + c2.getX());
		}
		if(c1.getX()>c2.getX()) {
			System.out.println("Car 1 Wins!");
		}
		else if(c2.getX()>c1.getX()) {
			System.out.println("Car 2 Wins!");
		}
		else {
			System.out.println("Tie!");
		}

	}

}
