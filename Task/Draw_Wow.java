import javax.swing.*;
import java.awt.*;


public class Draw_Wow extends JPanel
{
    public void paintComponent(Graphics)
    {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(10,10,200,200);

        g.setColor(Color.BLACK);
        g.fillOval(55,55,30,50);
        g.fillOval(135,55,30,50);

        g.fillOval(75,110,65,90);
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(90,125,35,60);
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(63,65,15,25);
        g.fillOval(142,65,15,25);

    }
}