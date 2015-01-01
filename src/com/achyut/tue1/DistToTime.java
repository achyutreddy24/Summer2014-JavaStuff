package com.achyut.tue1;

import java.util.Scanner;

public class DistToTime {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a distance to find how long it will take to travel it");
		Scanner s = new Scanner(System.in);
		double num = s.nextInt();
		for(double i = 25;i<=70;i+=5){
			double n = num/i;
			n = n*60;
			int n2 = (int)n/60;
			int min = (int)n%60;
			System.out.println(n2+" hours and "+ min  + " minutes");
		}

	}

}
