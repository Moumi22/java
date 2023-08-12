import javax.swing.JFrame;

public class DrawSmiley1Test
{
    public static void main(String[] args)
    {
    DrawSmiley1 panel = new DrawSmiley1(); 
    JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250); 
        application.setVisible(true);
    }
}
    

