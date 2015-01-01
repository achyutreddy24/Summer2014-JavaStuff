package com.achyut.graphics;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class CubeRun {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setTitle("3D Cube");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.setResizable(true);
		
		Container p = f.getContentPane();
		CubePanel c = new CubePanel();
		p.add(c);
	}

}
