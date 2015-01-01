package com.achyut.graphics;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class CrazyRun {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setTitle("Crazy Shapes");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(700, 700);
		f.setLayout(new GridLayout(1,1));
		f.setResizable(true);

		for (int i = 0; i < 1; i++) {
			Container p = f.getContentPane();
			CrazyPanel c = new CrazyPanel();
			p.add(c);
		}
	}
}
