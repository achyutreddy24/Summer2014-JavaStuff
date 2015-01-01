package animation;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

import com.achyut.mouseInteraction.CrossPanel;
//JFrame, JPanel classes

//Container, GridLayout, Color classes
public class Runner {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Box Bounce");
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = f.getContentPane();
		f.setLayout(new GridLayout(4, 4));

		for (int i = 0; i <16 ; i++) {
			CrossPanel p1 = new CrossPanel();
			pane.add(p1);
		}
		f.setVisible(true);
	}
}