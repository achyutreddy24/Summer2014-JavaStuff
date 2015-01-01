package com.achyut.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TriPanel extends JPanel{
	
	public TriPanel(Color c) {
		setBackground(c);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		int[] xPoints = new int [4];
		int[] yPoints = new int [4];
		
		xPoints[0] = w/2;
		xPoints[1] = w;
		xPoints[2] = 0;
		
		yPoints[0] = 0;
		yPoints[1] = h;
		yPoints[2] = h;
		
		g.setColor(Color.white);
		
		g.fillPolygon(xPoints, yPoints, 3);
		
		int numTri = w/2;
		for(int i=1;i<numTri;i++){
			
			if(i%7 == 1){
				g.setColor(Color.red);
			}
			else if(i%7 == 2) {
				g.setColor(Color.gray);
			}
			else if(i%7 == 3) {
				g.setColor(Color.CYAN);
			}
			else if(i%7 == 4) {
				g.setColor(Color.orange);
			}
			else if(i%7 == 5) {
				g.setColor(Color.magenta);
			}
			else if(i%7 == 6) {
				g.setColor(Color.blue);
			}
			else{
				g.setColor(Color.white);
			}
			
			xPoints[0] = w/2;
			xPoints[1] = w-(i);
			xPoints[2] = 0+(i);
		
			yPoints[0] = 0+(i);
			yPoints[1] = h-(i);
			yPoints[2] = h-(i);
			
			g.fillPolygon(xPoints, yPoints, 3);
		}
		
		

	}
}
