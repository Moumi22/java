import javax.swing.JFrame;

public class DrawRainbow1Test 
{
    public static void main(String[] args)
    {
        DrawRainbow1 panel = new DrawRainbow1(); 
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);
    }
}
