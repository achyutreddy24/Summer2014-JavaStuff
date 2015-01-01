package com.achyut.polygon;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class PolygonDraw {
	public static String cRed = "000";
	public static String cGreen = "000";
	public static String cBlue = "000";
	public static boolean fill;

	public int red;
	public int green;
	public int blue;
	
	public int numSides;

	public static boolean RIGHT_TO_LEFT = false;

	@SuppressWarnings("rawtypes")
	static JComboBox sides;
	static JTextField tRed = new JTextField("000");
	static JTextField tGreen = new JTextField("000");
	static JTextField tBlue = new JTextField("000");
	static JCheckBox fillBox = new JCheckBox("Fill");

	private static PolygonBoard j;
	private static JButton button = new JButton("Draw");

	public PolygonDraw(PolygonBoard x) {
		JFrame guiFrame = new JFrame("Polygon Draw");
		guiFrame.setTitle("Polygon Draw");
		guiFrame.setSize(800, 400);
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j = x;
		button.addActionListener(new Button());
		// This will center the JFrame in the middle of the screen
		guiFrame.setLocationRelativeTo(null);
		// guiFrame.pack();
		guiFrame.setVisible(true);

		// Set up the content pane and components in FlowLayout
		addComponents(guiFrame.getContentPane());
	}

	private class Button implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			cRed = tRed.getText();
			cGreen = tGreen.getText();
			cBlue = tBlue.getText();

			fill = fillBox.isSelected();
			
			numSides = (int)sides.getSelectedItem();
			
			red = Integer.parseInt(cRed);
			green = Integer.parseInt(cGreen);
			blue = Integer.parseInt(cBlue);

			j.changeColor(red, green, blue);
			j.setSides(numSides);
			j.setFill(fill);
			j.refresh();
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void addComponents(Container contentPane) {
		if (RIGHT_TO_LEFT) {
			contentPane
					.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JLabel("PolygonDraw"));

		contentPane.add(button);

		contentPane.add(new JButton("Clear"));

		contentPane.add(fillBox);

		contentPane.add(new JLabel("Red"));
		contentPane.add(tRed);

		contentPane.add(new JLabel("Green"));
		contentPane.add(tGreen);

		contentPane.add(new JLabel("Blue"));
		contentPane.add(tBlue);

		Integer[] options = { 3, 4, 5, 6, 7, 8, 9, 10 };
		sides = new JComboBox(options);
		sides.setSelectedIndex(0);

		contentPane.add(new JLabel("Number of Sides"));
		contentPane.add(sides);

		contentPane.add(j);
	}

}
