package com.achyut.graphics;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class OvalRun {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setTitle("Overlapping Ovals");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(333, 333);
		f.setResizable(true);
		
		Container p = f.getContentPane();
		OvalPanel o = new OvalPanel(Color.green);
		p.add(o);
}
}
