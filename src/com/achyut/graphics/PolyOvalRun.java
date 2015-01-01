package com.achyut.graphics;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class PolyOvalRun {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setTitle("Overlapping Ovals");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(700, 700);
		f.setResizable(true);
		f.setLayout(new GridLayout(3,3));
		
		Container p = f.getContentPane();
		
		PolyOvalPanel c1 = new PolyOvalPanel();
		p.add(c1);
		
		PolyOvalPanel c2 = new PolyOvalPanel();
		p.add(c2);
		
		PolyOvalPanel c3 = new PolyOvalPanel();
		p.add(c3);
		
		PolyOvalPanel c4 = new PolyOvalPanel();
		p.add(c4);
		
		PolyOvalPanel c5 = new PolyOvalPanel();
		p.add(c5);
		
		PolyOvalPanel c6 = new PolyOvalPanel();
		p.add(c6);
		
		PolyOvalPanel c7 = new PolyOvalPanel();
		p.add(c7);
		
		PolyOvalPanel c8 = new PolyOvalPanel();
		p.add(c8);
		
		PolyOvalPanel c9 = new PolyOvalPanel();
		p.add(c9);
	}

}
