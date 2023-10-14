import javax.swing.JFrame;

public class DrawPanel1Test
{
	public static void main(String[] args)
	{
		DrawPanel1 panel = new DrawPanel1();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);  
        application.setSize(300, 300); 
        application.setVisible(true); 
	}
}
