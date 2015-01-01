package com.achyut.thu2;

public class CubeRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cube c = new Cube(3);
		System.out.println("Voume is " + c.volume());
		System.out.println("Surface Area is " + c.surfaceArea());
		c.setSideForVolume(125);
		System.out.println("Side is " + c.getSide());
		System.out.println("Surface Area is " + c.surfaceArea());
	}

}
