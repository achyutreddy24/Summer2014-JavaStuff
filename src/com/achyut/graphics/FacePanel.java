package com.achyut.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FacePanel extends JPanel {
	public FacePanel(Color c) {
		setBackground(c);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		/*
		Color cl = new Color((int)( 254 * Math.random() ) + 0 ,(int)( 254 * Math.random() ) + 0 ,(int)( 254 * Math.random() ) + 0);
		Color cl2 = new Color((int)( 254 * Math.random() ) + 0 ,(int)( 254 * Math.random() ) + 0 ,(int)( 254 * Math.random() ) + 0);
		Color cl3 = new Color((int)( 254 * Math.random() ) + 0 ,(int)( 254 * Math.random() ) + 0 ,(int)( 254 * Math.random() ) + 0);
		Color cl4 = new Color((int)( 254 * Math.random() ) + 0 ,(int)( 254 * Math.random() ) + 0 ,(int)( 254 * Math.random() ) + 0);
		Color cl5 = new Color((int)( 254 * Math.random() ) + 0 ,(int)( 254 * Math.random() ) + 0 ,(int)( 254 * Math.random() ) + 0);
		*/
		int w = getWidth();
		int h = getHeight();
		
		//g.fillArc(x, y, width, height, startAngle, arcAngle);
		
		/*
		g.setColor(Color.black);
		g.drawOval(20, 464, 200, 70);
		
		g.setColor(Color.green);
		g.fillRect(20, 50, 200, 450);
		g.setColor(Color.black);
		g.drawRect(20, 50, 200, 450);
		g.setColor(Color.cyan);
		g.setColor(Color.black);
		g.drawOval(20, 15, 200, 70);
		//g.drawOval(20, 15, 200, 70);
		g.setColor(Color.green);
		g.fillOval(20, 15, 200, 70);
		//g.drawLine(20, 50, 20, 500);
		//g.drawLine(220, 50, 220, 500);
		
		g.setColor(Color.green);
		g.fillOval(20, 464, 200, 70);
		
		*/
		
		g.drawRect(200, 200, 200, 200);
		g.drawRect(100, 100, 200, 200);
		g.drawLine(200, 200, 100, 100);
		g.drawLine(100, 300, 200, 400);
		g.drawLine(300, 300, 400, 400);
		g.drawLine(300, 100, 400, 200);
		
		/*
		g.setColor(cl);
		g.fillOval((int)( w * Math.random() ) + 0, (int)( h * Math.random() ) + 0,20,20);
		g.setColor(cl2);
		g.fillOval((int)( w * Math.random() ) + 0, (int)( h * Math.random() ) + 0,20,20);
		g.setColor(cl3);
		g.fillOval((int)( w * Math.random() ) + 0, (int)( h * Math.random() ) + 0,20,20);
		g.setColor(cl4);
		g.fillOval((int)( w * Math.random() ) + 0, (int)( h * Math.random() ) + 0,20,20);
		g.setColor(cl5);
		g.fillOval((int)( w * Math.random() ) + 0, (int)( h * Math.random() ) + 0,20,20);
		*/
		//g.drawOval(0, 0, w, h);
		//g.drawLine(0, 0, w, h);
		//g.drawLine(0, h, w, 0);
		//g.fillOval(75, 100, 20, 20);
		//g.fillOval(125, 100, 20, 20);
		//g.setColor(Color.BLACK);
		//g.fillRect(90, 200, 40, 15);
	}
}