
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
* FrameViewer allows a frame of graphics to be
viewed
*
* @author (your name)
* @version (a version number or a date)
*/
public class FrameViewer
{
/**
* main method that controls the program
*/
public static void main(String[] args)
    {
    JFrame frame = new JFrame();
    frame.setSize(600, 800);
    frame.setTitle("David's art work");
    MyComponent canvas = new MyComponent();
    frame.add(canvas);
    frame.setDefaultCloseOperation
    (JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }
}
