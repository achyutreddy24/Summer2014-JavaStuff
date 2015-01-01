package com.achyut.graphics;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class OutsideRun {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setTitle("Overlapping Ovals");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(700, 700);
		f.setResizable(true);
		
		Container p = f.getContentPane();
		OutsidePanel c = new OutsidePanel(Color.blue);
		p.add(c);
	}

}
