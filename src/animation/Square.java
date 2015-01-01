package animation;

import java.awt.*;
public class Square {
  private int x, y; // coordinates of its upper left hand corner
  private int side;
  private int dx, dy; // how it moves in the x and y directions
  private int width, height; // size of its containing panel
  private Color c= Color.BLACK;
  int time =0;
  boolean ud=true;
  public Square( int s ){
    x = 0;
    y = 400;
    side = s;
    dx = 0;
    dy = 0;
    width = 0;
    height = 0;
  }
  public Square( int s, Color b){
   c=b;
   x = 0;
   y = 0;
    side = s;
    dx = 0;
    dy = 0;
    width = 0;
    height = 0;
  }
  public void setSpeed( int xd, int yd ){
    dx = xd;
    dy = yd;
    
  }
  public void setContainer( int w, int h ){
    width = w;
    height = h; 
  }
  public void move(){
//time++;
//if(ud){
//	dy=(time/1000)*(time/1000);
//	}
//else
//dy=-(time/1000)*(time/1000);
    x += dx;
    y += dy;
    if ( x + side >= width )
      dx = -Math.abs( dx );
    if ( x <=0)
      dx = Math.abs( dx );
    if( y+ side>= height){
      dy = -Math.abs( dy );
    //  time=0;
     // ud=false;
    }
    if( y<= 0)
      dy = Math.abs( dx );
    
  }
  public void setColor( Color a){
    c= a;
  }
  public void draw(Graphics g){
    g.setColor(c);
    g.fillOval( x, y, side, side );
    
  }
  public int getX(){
	  return x;
  }
  public int getY(){
	  return y;
		  
  }
}