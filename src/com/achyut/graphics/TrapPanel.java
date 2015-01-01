package com.achyut.graphics;

import java.awt.Graphics;

import javax.swing.JPanel;

public class TrapPanel extends JPanel {

	public TrapPanel() {

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);


		int[] xpts = new int[4];
		int[] ypts = new int[4];
		xpts[0] = 20;
		xpts[1] = 120;
		xpts[2] = 150;
		xpts[3] = 20;
		ypts[0] = 50;
		ypts[1] = 50;
		ypts[2] = 200;
		ypts[3] = 200;

		g.fillPolygon(xpts, ypts, 4);

	}
}