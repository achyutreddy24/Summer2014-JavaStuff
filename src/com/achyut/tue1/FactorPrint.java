package com.achyut.tue1;

import java.util.Scanner;

public class FactorPrint {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter a number to get all the factors of it");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int i = 1;i<=num;i++){
			if(num%i == 0) {
				System.out.println(i);
			}
		}

	}

}
