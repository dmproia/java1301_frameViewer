
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.Font;
/**
* object of class myComponent provide a "canvas" to
record your art work.
*
* @author (David Proia)
* @version (Feb 28, 2012)
*/
public class MyComponent extends JComponent
{
/**
* method used in awt to "paint" on the component
*
* @param g graphics used to "paint" with
* @return none
*/
public void paintComponent(Graphics g)
    {
    // declares the 2D Graphics object and a Rectangle
    Graphics2D g2;
    Rectangle box;
    // recast the Graphics object as a 2D Graphics
    g2 = (Graphics2D) g;
    // Construct a rectangle and draw it
    box = new Rectangle (5, 10, 20, 30);
    g2.draw(box);
    // Move rectangle 15 units to right, 25 units down
    // change the color of graphics to blue
    box.translate(15, 25);
    g2.setColor(Color.BLUE);
    // draw the rectangle in a second location
    g2.draw(box);
    
      Color c5 = new Color(0x99CC00);
      g2.setColor(c5);
      Font f = new Font("Times New Roman", Font.BOLD, 46);
      g2.setFont(f);
      g2.drawString("David Proia", 170, 100);
      Color c6 = new Color(0x990033);
      g2.setColor(c6);
      g2.drawString("Assignment 3", 170, 150);

          
    // 2D arc I made to simulate Pacman left to right
      Color c1 = new Color(0xFFFF33);
      g2.setColor(c1);
     //x, y, width, height, start, extent
      Arc2D ach = new Arc2D.Double(30,
        300,
        50,
        50,
        60,
        290,
        Arc2D.PIE);
      g2.fill(ach);
      // 2 Elipse I made to simulate what pacman eats
      Color c3 = new Color(0xFF0000);
      g2.setColor(c3);
      // Ellipse x, y, width, height
      Ellipse2D.Double pac = new Ellipse2D.Double(80,305,15,15);
      g2.fill(pac);
      
      Ellipse2D.Double pac1 = new Ellipse2D.Double(100,310,15,15);
      g2.fill(pac1);
      
      Ellipse2D.Double pac3 = new Ellipse2D.Double(120,305,15,15);
      g2.fill(pac3);    
      
      // 2nd 2D arc I made to simulate Pacman right to left
      Color c2 = new Color(0xFF0000);
      g2.setColor(c2);
      //x, y, width, height, start, extent
      Arc2D ach2 = new Arc2D.Double(
        450,
        300,
        50,
        50,
        230,
        285,
        Arc2D.PIE);
      g2.fill(ach2);
      // 2 Elipse I made to simulate what pacman eats
      Color c4 = new Color(0xFFFF33);
      g2.setColor(c4);
      // Ellipse x, y, width, height
      Ellipse2D.Double ac = new Ellipse2D.Double(380,320,15,15);
      g2.fill(ac);
      
      Ellipse2D.Double ac1 = new Ellipse2D.Double(400,315,15,15);
      g2.fill(ac1);
      
      Ellipse2D.Double ac3 = new Ellipse2D.Double(420,320,15,15);
      g2.fill(ac3);          
    }
}