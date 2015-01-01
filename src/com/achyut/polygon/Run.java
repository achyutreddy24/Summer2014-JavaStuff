package com.achyut.polygon;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

public class Run {
	public static void main(String[] args) {

		final PolygonBoard x = new PolygonBoard(0, 0, 0, 3);
		// x.changeColor(red, green, blue);

		x.setLayout(new GridLayout(1, 1));
		x.setPreferredSize(new Dimension(700, 300));

		// Use the event dispatch thread for Swing components
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new PolygonDraw(x);
			}
		});

	}
}
