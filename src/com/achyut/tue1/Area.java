package com.achyut.tue1;

public class Area {

	public static void main(String[] args) {
		AreaLib area = new AreaLib();
		
		int n = 6;
		
		 int a = area.squareArea(n);
		 System.out.println(a);
		 
		 double t = area.triangleArea(6, 6);
		 System.out.println(t);
		 
		 int g = area.rectangleArea(4, 7);
		 System.out.println(g);
		 
		 String isSahasFat = area.sahasArea(99999);
		 System.out.println(isSahasFat);
		 
				 
	}
}
