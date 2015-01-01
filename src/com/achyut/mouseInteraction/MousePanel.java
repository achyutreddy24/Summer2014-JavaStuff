package com.achyut.mouseInteraction;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MousePanel extends JPanel {
	private int x = 10, y = 10;

	public MousePanel() {
		setBackground(Color.ORANGE);
		HandleMouse hm = new HandleMouse();
		addMouseListener(hm);
		// important
	}

	
	int counter = 1;
	public void paintComponent(Graphics g) {
		counter++;
		if(counter%2 == 0){
			super.paintComponent(g);
			g.drawOval(x-25, y-25, 50, 50);
		}
		else{
			super.paintComponent(g);
			g.drawRect(x-25, y-25, 50, 50);
		}
		
	}

	private class HandleMouse extends MouseAdapter {
		// A private class in a public class
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			// e.getX returns the x coordinate of the cursor
			y = e.getY();
			// e.getY returns the y coordinate of the cursor
			repaint();
			// sends a message to the JVM to repaint the panel
		}
		// the JVM in turn calls the paintComponent method
	}
}