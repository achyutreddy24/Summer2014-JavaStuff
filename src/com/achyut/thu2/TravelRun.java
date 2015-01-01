package com.achyut.thu2;

public class TravelRun {
	public static void main(String[] args) {
		for(int i = 6; i<=40; i++, i++) {
			Travel t = new Travel(i);
			System.out.println("people = " + i + ", vans = " + t.goByVan() + ", canoes = " + t.goByCanoe() + ", planes = " + t.goByPlane());
		}
	}

}
