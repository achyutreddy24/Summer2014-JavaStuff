package com.achyut.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PolyOvalPanel extends JPanel {
	public PolyOvalPanel() {

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		g.setColor(Color.red);
		g.fillOval(0, 0, w, h);

		int[] xpts = new int[4];
		int[] ypts = new int[4];

		g.setColor(Color.white);
		xpts[0] = w / 2;
		xpts[1] = w;
		xpts[2] = w / 2;
		xpts[3] = 0;

		ypts[0] = 0;
		ypts[1] = h / 2;
		ypts[2] = h;
		ypts[3] = h / 2;

		g.fillPolygon(xpts, ypts, 4);

	}
}
