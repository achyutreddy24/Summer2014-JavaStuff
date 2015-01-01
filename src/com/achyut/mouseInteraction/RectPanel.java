package com.achyut.mouseInteraction;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class RectPanel extends JPanel {

	private int x = 10;
	private int y = 10;
	private int x2 = 10;
	private int y2 = 10;
	
	public RectPanel() {
		HandleMouse hm = new HandleMouse();
		addMouseListener(hm);
		setBackground(Color.green);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillRect(x, y, x2-x, y2-y);

	}

	private class HandleMouse extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
		}

		public void mouseReleased(MouseEvent e) {
			x2 = e.getX();
			y2 = e.getY();
			repaint();
		}
	}

}
