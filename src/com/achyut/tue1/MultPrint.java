package com.achyut.tue1;

import java.util.Scanner;

public class MultPrint {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter a number to get the first 12 multiples of it (1-11)");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i = 0; i <=12; i++) {
			int n = num * i;
			System.out.println(n);
		}

	}

}
