package com.achyut.codingbat;

public class CodingBatMethods {

	public String doubleChar(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s = s + str.substring(i, i + 1) + str.substring(i, i + 1);
		}
		return s;
	}

	public int countHi(String str) {
		int t = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi")) {
				t++;
			}
		}
		return t;
	}

	public boolean catDog(String str) {
		int d = 0, c = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				c++;
			}
		}
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("dog")) {
				d++;
			}
		}
		if (d == c) {
			return true;
		}
		return false;
	}

	public boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();

		int n1 = a.length();
		int n2 = b.length();

		if (n1 > n2) {
			String s1 = a.substring(n1 - n2, n1);
			if (s1.equals(b)) {
				return true;
			} else {
				return false;
			}
		} else {
			String s1 = b.substring(n2 - n1, n2);
			if (s1.equals(a)) {
				return true;
			} else {
				return false;
			}
		}
	}

	public String mixString(String a, String b) {
		String n = "";
		String total = "";
		if (a.length() > b.length()) {
			n = a.substring(b.length(), a.length());
			a = a.substring(0, b.length());
		} else if (b.length() > a.length()) {
			n = b.substring(a.length(), b.length());
			b = b.substring(0, a.length());
		}

		for (int i = 0; i < a.length(); i++) {
			String x = a.substring(i, i + 1);
			String y = b.substring(i, i + 1);
			total = total + x + y;
		}
		total = total + n;
		return total;
	}

	public String repeatEnd(String str, int n) {
		String s = str.substring(str.length() - n);
		String total = "";
		for (int i = 0; i < n; i++) {
			total = total + s;
		}
		return total;
	}

	public String repeatFront(String str, int n) {
		String total = "";
		String s = str.substring(0, n);
		for (int i = n; i > 0; i--) {
			total = total + s;
			s = s.substring(0, s.length() - 1);

		}
		return total;
	}

}
