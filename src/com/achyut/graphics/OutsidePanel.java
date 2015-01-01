package com.achyut.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class OutsidePanel extends JPanel {
	
	public OutsidePanel(Color c) {
		setBackground(c);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		g.setColor(Color.yellow);
		g.fillOval(w/9, h/9, w/9*3, h/9*3);
		
		int green = 0;
		for(int i=255;i>0;i--){
			green++;
			if(green<255){
				g.setColor(new Color(0, green, 0));
			}
			g.drawRect(0, h/2+(i*h/510), w, h/510);
		}
		
	}

}
