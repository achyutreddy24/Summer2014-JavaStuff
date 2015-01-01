package com.achyut.graphics;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class TriRun {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setTitle("Overlapping Triangles");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(100, 100);
		f.setResizable(true);
		
		Container p = f.getContentPane();
		TriPanel o = new TriPanel(Color.green);
		p.add(o);
	}
		

}
