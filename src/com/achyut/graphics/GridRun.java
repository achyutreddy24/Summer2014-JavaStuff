package com.achyut.graphics;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GridRun {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setTitle("Grid");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(200, 200);
		f.setLayout(new GridLayout(2,2));
		f.setResizable(true);
		
		Container p = f.getContentPane();
		GridPanel c = new GridPanel(5);
		p.add(c);
		
		GridPanel c2 = new GridPanel(10);
		p.add(c2);
		
		GridPanel c3 = new GridPanel(15);
		p.add(c3);
		
		GridPanel c4 = new GridPanel(20);
		p.add(c4);
	}

}
