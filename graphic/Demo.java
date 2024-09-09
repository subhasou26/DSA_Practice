import java.applet.Applet;
import java.awt.*;
public class Demo extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawLine(20, 30, 20, 300);
        g.drawRect(70, 100, 30, 30);
    }
}