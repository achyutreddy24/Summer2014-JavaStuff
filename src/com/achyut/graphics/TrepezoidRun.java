package com.achyut.graphics;

import java.awt.Container;

import javax.swing.JFrame;

public class TrepezoidRun {

		public static void main(String[] args) {
			JFrame f = new JFrame();
			f.setVisible(true);
			f.setTitle("Trapezoid");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(333, 333);
			f.setResizable(true);
			
			Container p = f.getContentPane();
			TrapPanel t = new TrapPanel();
			p.add(t);
		}
			
}