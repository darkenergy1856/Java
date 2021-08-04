import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SwingVersion extends JFrame {
    public SwingVersion(String title){
        super(title);
        setSize(200,200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        JLabel label = new JLabel("Press any Key.");
        label.setBounds(40,20,150,100);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed : " + e.getKeyChar());
            }
        });

        add(label);
    }
}
