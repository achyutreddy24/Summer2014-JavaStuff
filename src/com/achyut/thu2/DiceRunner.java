package com.achyut.thu2;

public class DiceRunner {
	public static void main(String[] args) {
		Dice d = new Dice();
		d.roll();
		int n = d.getTotal();
		System.out.println( n );
		d.roll();
		n = d.getTotal();
		System.out.println( n );
	}
	
}
