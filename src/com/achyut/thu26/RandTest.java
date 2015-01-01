package com.achyut.thu26;

import java.util.Random;

public class RandTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		// int randomAnswer = rand.nextInt(Numberlines);
		int randomOption = rand.nextInt(10);

		System.out.println(randomOption);

	}

}
