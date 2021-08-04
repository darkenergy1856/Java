import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SwingVersion {

    public SwingVersion() {
        JFrame jFrame = new JFrame("Program_10");

        JButton jButton1 = new JButton("Red");
        JButton jButton2 = new JButton("Blue");

        jButton1.setBounds(40,40,100,100);
        jButton2.setBounds(150,40,100,100);

        jFrame.getContentPane().add(jButton1);
        jFrame.getContentPane().add(jButton2);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().setBackground(Color.red);
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().setBackground(Color.BLUE);
            }
        });




        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().setPreferredSize(new Dimension(300,200));
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    public static void main(String[] args) {
        new SwingVersion();
    }
}
