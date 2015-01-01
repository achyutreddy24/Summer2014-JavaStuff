package com.achyut.mouseInteraction;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class ArrayPanel extends JPanel {
	private Point[] pts = new Point[5];
	private int numPts = 0;

	// tracks the number of points we care about
	public ArrayPanel() {
		setBackground(Color.ORANGE);
		HandleMouse hm = new HandleMouse();
		addMouseListener(hm);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 1; i < numPts; i++) {
			g.drawLine(pts[i - 1].x, pts[i - 1].y, pts[i].x, pts[i].y);
		}
		if (numPts == 5)
			g.drawLine(pts[0].x, pts[0].y, pts[4].x, pts[4].y);
	}

	private class HandleMouse extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			Point p = new Point(x, y);
			if (numPts < 5) {
				pts[numPts] = p;
			} else {
				numPts = 0;
				pts[0] = p;
			}
			numPts++;
			repaint();
		}
	}
}