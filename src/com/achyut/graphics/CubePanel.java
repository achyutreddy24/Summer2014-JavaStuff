package com.achyut.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CubePanel extends JPanel {
	public CubePanel() {

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int[] xpts = new int[4];
		int[] ypts = new int[4];
		
		g.setColor(Color.gray);
		xpts[0] = 50;
		xpts[1] = 100;
		xpts[2] = 130;
		xpts[3] = 80;
		
		ypts[0] = 50;
		ypts[1] = 50;
		ypts[2] = 80;
		ypts[3] = 80;

		g.fillPolygon(xpts, ypts, 4);
		
		g.setColor(Color.darkGray);
		xpts[0] = 50;
		xpts[1] = 80;
		xpts[2] = 80;
		xpts[3] = 50;
		
		ypts[0] = 50;
		ypts[1] = 80;
		ypts[2] = 130;
		ypts[3] = 100;

		g.fillPolygon(xpts, ypts, 4);
		
		g.setColor(Color.lightGray);
		g.fillRect(80, 80, 50, 50);
		

	}
}
