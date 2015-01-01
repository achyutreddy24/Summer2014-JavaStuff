package com.achyut.graphics;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class CircleRun {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setTitle("Overlapping Ovals");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(333, 333);
		f.setResizable(true);
		
		Container p = f.getContentPane();
		CirclesPanel c = new CirclesPanel(Color.red);
		p.add(c);
	}
}
