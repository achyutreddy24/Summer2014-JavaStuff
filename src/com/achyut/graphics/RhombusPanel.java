package com.achyut.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RhombusPanel extends JPanel {
	public RhombusPanel(Color c) {
		setBackground(c);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		g.drawLine(w/2, 0, 0, h/2);
		g.drawLine(w/2, 0, w, h/2);
		g.drawLine(w/2, h, 0, h/2);
		g.drawLine(w/2, h, w, h/2);
		
		g.drawLine(w/2, h/5, w/5, h/2);
		g.drawLine(w/2, h/5, w/5*4, h/2);
		g.drawLine(w/2, h/5*4, w/5, h/2);
		g.drawLine(w/2, h/5*4, w/5*4, h/2);
		
		g.drawLine(w/2, h/4, w/4, h/2);
		g.drawLine(w/2, h/4, w/4*3, h/2);
		g.drawLine(w/2, h/4*3, w/4, h/2);
		g.drawLine(w/2, h/4*3, w/4*3, h/2);
		
		g.drawLine(w/2, h/3, w/3, h/2);
		g.drawLine(w/2, h/3, w/3*2, h/2);
		g.drawLine(w/2, h/3*2, w/3, h/2);
		g.drawLine(w/2, h/3*2, w/3*2, h/2);
		
	
	}
	
	
	
	

}
