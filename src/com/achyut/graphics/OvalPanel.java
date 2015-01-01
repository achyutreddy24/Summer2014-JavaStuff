package com.achyut.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class OvalPanel extends JPanel {
	
	public OvalPanel(Color c) {
		setBackground(c);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		
		for(int i = 2; i<=12; i++){
			if(i%2 == 0){
				g.setColor(Color.gray);
			}
			else{
				g.setColor(Color.darkGray);
			}
			g.fillOval(0, 30*i, w, h*i);
		}

	}
}
