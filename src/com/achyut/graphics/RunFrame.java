package com.achyut.graphics;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class RunFrame {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("First");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000, 1000);
		f.setResizable(true);
		//f.setLayout(new GridLayout(1,1));
		Container pane = f.getContentPane();
		pane.setBackground(Color.blue);
		pane.setLayout(new GridLayout(1, 1));
		FacePanel p1 = new FacePanel(Color.yellow);
		pane.add(p1);
		//FacePanel p2 = new FacePanel(Color.green);
		//pane.add(p2);
		//FacePanel p3 = new FacePanel(Color.blue);
		//pane.add(p3);
		f.setVisible(true);
	}
}