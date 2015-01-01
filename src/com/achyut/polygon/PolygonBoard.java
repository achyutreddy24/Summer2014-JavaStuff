package com.achyut.polygon;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PolygonBoard extends JPanel {

	private Color color;
	private Color backColor;
	int red, green, blue;
	private boolean fill;

	private int numSides = 0;

	

	public PolygonBoard(int red, int green, int blue, int numSides) {
		color = new Color(red, green, blue);
		backColor = new Color(255-red, 255-green, 255-blue);
	}

	public void changeColor(int r, int g, int b) {
		red = r;
		green = g;
		blue = b;
		color = new Color(red, green, blue);
		backColor = new Color(255-red, 255-green, 255-blue);
	}

	public void setSides(int s) {
		numSides = s;
	}

	public void setFill(boolean b) {
		fill = b;
	}

	public void refresh() {
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int w = getWidth();
		int h = getHeight();
		
		g.setColor(color);
		setBackground(backColor);
		
		if (fill) {
			int[] xpts = new int[numSides];
			int[] ypts = new int[numSides];
			for (int i = 0; i < numSides; i++) {
				xpts[i] = (int) (w * Math.random());

				ypts[i] = (int) (h * Math.random());
			}
			g.fillPolygon(xpts, ypts, numSides);
		} else {
			int[] xpts = new int[numSides];
			int[] ypts = new int[numSides];
			for (int i = 0; i < numSides; i++) {
				xpts[i] = (int) (w * Math.random());

				ypts[i] = (int) (h * Math.random());
			}
			g.drawPolygon(xpts, ypts, numSides);
		}
	}
}
