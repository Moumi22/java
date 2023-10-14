public class Draw_Wow
{
    public static void main(String[]args)
    {
        Draw_Wow = new Draw_Wow();

        JPanel frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(Wow);
        frame.setSize(240,300);
        frame.setTitle("Wow Face");
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.RED);
        frame.setVisible(true);

    }
}