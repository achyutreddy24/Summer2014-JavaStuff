package com.achyut.thu2;

import java.util.Random;

public class Dice {

	Random r = new Random();
	private int die1, die2;
	
	public Dice(){
		die1 = 1;
		die2 = 1;
	}
	
	public void roll() {
		die1 = r.nextInt(6);
		die2 = r.nextInt(6);
	}
	
	public int getTotal(){
		return die1+die2;
	}
}
 