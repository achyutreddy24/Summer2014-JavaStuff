package com.achyut.tue1;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int count = 0;
		Random rand = new Random();
		int randomNum = rand.nextInt(100);
		
		System.out.println("Guess a number 1-100");
		
		Scanner s = new Scanner (System.in);
		int guess = s.nextInt();
		
		while (guess != randomNum) {
			if (guess > randomNum) {
				count++;
				System.out.println("Your guess was too high, guess again");
				guess = s.nextInt();
			}
			else if (guess < randomNum) {
				count++;
				System.out.println("Your guess was too low, guess again");
				guess = s.nextInt();
			}
		}
		
		System.out.println("Correct, the number was " + randomNum + "\n You took " + count +" guesses");
		

	}

}
