package com.achyut.tue1;

import java.util.Scanner;

public class NumPrint {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers, the first one bigger than the second");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		for(int i=num1;i<=num2;i++){
			System.out.println(i);
		}

	}

}
