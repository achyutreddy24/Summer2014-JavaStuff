package com.achyut.mouseInteraction;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Runner {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Stuff");
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = f.getContentPane();
		pane.setLayout(new GridLayout(1, 1));

		// MousePanel p = new MousePanel();
		ArrayPanel p = new ArrayPanel();
		pane.add(p);
		
		//for (int i = 0; i < 100; i++) {
		//	RectOpenPanel p = new RectOpenPanel();
		//	pane.add(p);
		//}

		f.setVisible(true);
	}
}
