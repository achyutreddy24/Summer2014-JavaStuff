package com.achyut.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CirclesPanel extends JPanel {
	
	public CirclesPanel(Color c) {
		setBackground(c);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		if(w>=h){
			for(int i=20; i<h*2; i=i+20){
				g.setColor(Color.black);
				g.drawOval(0-i/2, 0-i/2, i, i);
			}
		}
		else{
			for(int i=20; i<w*2; i=i+20){
				g.setColor(Color.black);
				g.drawOval(0-i/2, 0-i/2, i, i);
			}
		}
		
		
	}

}
