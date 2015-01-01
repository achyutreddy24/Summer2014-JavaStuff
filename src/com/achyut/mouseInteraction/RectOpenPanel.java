package com.achyut.mouseInteraction;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class RectOpenPanel extends JPanel {

	private boolean mouseOver = false;
	private int x = 10;
	private int y = 10;
	
	private int radius = 0;

	int redb = (int) (256 * Math.random());
	int greenb = (int) (256 * Math.random());
	int blueb = (int) (256 * Math.random());
	Color colorb = new Color(redb, greenb, blueb);

	public RectOpenPanel() {
		HandleMouse hm = new HandleMouse();
		addMouseListener(hm);
		setBackground(colorb);
		addMouseMotionListener(hm);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		if (mouseOver) {
			setBackground(Color.black);
			g.setColor(Color.white);
			int radius = Math.abs(x-width/2);//(int)(Math.sqrt((x-(width/2))^2 + (y-(height/2))^2));
			//int dy= Math.abs(y-height/2);
			//radius=(int)Math.sqrt(dx^2+dy^2);
			g.fillOval((width/2)-radius, (height/2)-radius, radius*2, radius*2);
			//g.fillOval(width/2, height/2, 5, 5);
		} else {
			setBackground(colorb);
			g.setColor(Color.black);
			g.fillRect(20, 20, 70, 70);
		}
	}

	private class HandleMouse extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			mouseOver = true;
			repaint();
		}

		public void mouseExited(MouseEvent e) {
			mouseOver = false;
			repaint();
		}

		public void mouseMoved(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();

		}

	}

}
