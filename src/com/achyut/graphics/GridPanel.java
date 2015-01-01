package com.achyut.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GridPanel extends JPanel {
	private int spacing;
	int space;

	public GridPanel(int s) {
		spacing = s;
		int red = (int) (256 * Math.random());
		int green = (int) (256 * Math.random());
		int blue = (int) (256 * Math.random());
		Color color = new Color(red, green, blue);
		setBackground(color);
		
		space = s;
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		for(int i=0; i<h;i=i+space){
			g.drawLine(0, i, w, i);
		}
		
		for(int i=0; i<w;i=i+space){
			g.drawLine(i, 0, i, h);
		}

	}
}