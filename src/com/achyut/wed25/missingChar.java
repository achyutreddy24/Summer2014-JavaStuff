package com.achyut.wed25;

import java.util.Scanner;

public class missingChar {
	public static String missingChara(String str, int n) {
		if (n == 0) {
			System.out.println(str.substring(1));
			return str.substring(1);

		}
		int l = str.length();

		String s1 = str.substring(0, n);
		String s2 = str.substring(n + 1, l);
		System.out.println(s1 + s2);
		return s1 + s2;

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner get = new Scanner(System.in);
		System.out.println("Type a string");
		String string = get.nextLine();
		System.out.println("Type which number you want to replace");
		int num = get.nextInt();
		missingChara(string, num);
	}
}