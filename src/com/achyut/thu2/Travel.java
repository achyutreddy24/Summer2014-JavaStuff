package com.achyut.thu2;

public class Travel {
	private int people;

	public Travel(int n) {
		people = n;
	}

	public int goByVan() {
		int t = people/8;
		if(people%8 != 0) {
			t++;
			return t;
		}
		return t;

	}

	public int goByCanoe() {
		int t = people/3;
		if(people%3 != 0) {
			t++;
			return t;
		}
		return t;

	}

	public int goByPlane() {
		int t = people/12;
		if(people%12 != 0) {
			t++;
			return t;
		}
		return t;
	}
}