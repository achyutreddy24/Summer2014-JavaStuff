package com.achyut.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CrazyPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6463563175329575011L;



	public CrazyPanel() {

		int redb = (int)(256*Math.random());
		int greenb = (int)(256*Math.random());
		int blueb = (int)(256*Math.random());
		Color colorb = new Color( redb, greenb, blueb );
		
		setBackground(colorb);
		
		
	}
	
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		
		
		int red = (int)(256*Math.random());
		int green = (int)(256*Math.random());
		int blue = (int)(256*Math.random());
		Color color = new Color( red, green, blue );
		g.setColor(color);
		
		int numSides = (int)(500*Math.random());
		
		int[] xpts = new int[numSides];
		int[] ypts = new int[numSides];
		
		for(int i = 0;i<numSides;i++){
			xpts[i] = (int)(w*Math.random());

			ypts[i] = (int)(h*Math.random());
		}
		
		g.fillPolygon(xpts, ypts, numSides);
		
	}
}
