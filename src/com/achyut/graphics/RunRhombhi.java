package com.achyut.graphics;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class RunRhombhi {
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setTitle("9 Rhombus");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(333, 333);
		f.setResizable(true);
		
		Container p = f.getContentPane();
		
		p.setLayout(new GridLayout(3, 3));
		
		
		RhombusPanel p1 = new RhombusPanel(Color.yellow);
		p.add(p1);

		RhombusPanel p2 = new RhombusPanel(Color.blue);
		p.add(p2);
		
		RhombusPanel p3 = new RhombusPanel(Color.green);
		p.add(p3);
		
		RhombusPanel p4 = new RhombusPanel(Color.orange);
		p.add(p4);
		
		RhombusPanel p5 = new RhombusPanel(Color.cyan);
		p.add(p5);
		
		RhombusPanel p6 = new RhombusPanel(Color.magenta);
		p.add(p6);
		
		RhombusPanel p7 = new RhombusPanel(Color.pink);
		p.add(p7);
		
		RhombusPanel p8 = new RhombusPanel(Color.red);
		p.add(p8);
		
		RhombusPanel p9 = new RhombusPanel(Color.yellow);
		p.add(p9);
	}

}
