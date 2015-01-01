package com.achyut.mouseInteraction;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class CrossPanel extends JPanel {
	private boolean x;

	public CrossPanel() {
		x = false;
		HandleMouse hm = new HandleMouse();
		addMouseListener(hm);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.blue);
		if (x) {
			g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
			g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
		}
	}

	private class HandleMouse extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			x = true;
			repaint();
		}

		public void mouseExited(MouseEvent e) {
			x = false;
			repaint();
		}
	}
}
