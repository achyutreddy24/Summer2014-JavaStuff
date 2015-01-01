package com.achyut.thu3;

public class Number {
	private int num;

	public Number() {
		num = (int) (100 * Math.random()) + 1;
	}

	public boolean multipleOf(int x) {
		if(num%x == 0) {
			return true;
		}
		return false;
	}

	public boolean guess(int x) {
		if(num == x) {
			return true;
		}
		return false;
	}
}
