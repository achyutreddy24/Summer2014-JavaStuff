package com.achyut.tue1;

import java.util.Scanner;

public class FibGen {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter a number to calculate the Fibonacci Sequence to");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int count = 0;
		long n1 = 0;
		long n2 = 1;
		while(count <= num){
			System.out.println(n1);
			long t = n1;
			n1 = n1 + n2;
			n2 = t;
			count++;
		}

	}

}
