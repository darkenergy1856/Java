import javax.swing.*;
import java.awt.*;


public class SwingVersion{

    public SwingVersion() {
        JFrame jframe = new JFrame("Program_9");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setPreferredSize(new Dimension(200,100));
        jframe.getContentPane().setBackground(Color.PINK);
        JLabel label =  new JLabel("This is Program_9.");
        jframe.getContentPane().add(label);
        jframe.pack();
        jframe.setVisible(true);

    }

    public static void main(String[] args) {
        new SwingVersion();
    }
}
