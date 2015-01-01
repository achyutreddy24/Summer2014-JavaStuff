package com.achyut.thu3;

import java.util.Scanner;

public class NumberRun {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Number n = new Number();
		boolean keepPlaying = true;
		int count = 0;
		while (keepPlaying) {
			count++;
			System.out.println("Enter a positive integer");
			int num = s.nextInt();
			boolean isMult = n.multipleOf(num);

			if (isMult) {
				System.out
						.println("Secret number IS a multiple of that number");
			} else {
				System.out
						.println("Secret number is NOT a multiple of that number");
			}
			System.out.println("Guess the secret number");
			int gNum = s.nextInt();
			if (n.guess(gNum)) {
				System.out.println("Congratulations, you guessed it, you took " + count + " guesses");
				keepPlaying = false;
			} else {
				System.out.println("Wrong");
				count++;
			}

		}
	}
}