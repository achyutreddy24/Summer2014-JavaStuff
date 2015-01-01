package animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class AnimationPanel extends JPanel {
   private javax.swing.Timer timer;
   private Square sq;
   public AnimationPanel() {
      setBackground( Color.blue );
      addComponentListener( new Ears() );
      sq = new Square( 15 );
      sq.setSpeed( 1, 1000);
      timer = new javax.swing.Timer( 1, new GoGo() );
      timer.start();
     
   }
   public void paintComponent( Graphics g ) {
      super.paintComponent( g );
      g.setColor(Color.green);
      sq.draw( g );
//      g.drawPolyline(xPoints, yPoints, nPoints);

   }
   private class GoGo implements ActionListener {
      public void actionPerformed(ActionEvent e) {
    	  
         sq.move();
        /* int r= (int)(255*Math.random())+1;
         int g= (int)(255*Math.random())+1;
         int b= (int)(255*Math.random())+1;
         sq.setColor(new Color(r,g,b));*/
         repaint(); // this tells the JVM that the panel needs to be redrawn
      }
   }
   private class Ears implements ComponentListener {
      public void componentHidden(ComponentEvent e) {}
      public void componentMoved(ComponentEvent e) {}
      public void componentShown(ComponentEvent e) {}
      public void componentResized(ComponentEvent e) {
         sq.setContainer( getWidth(), getHeight() );
      }
   }
}