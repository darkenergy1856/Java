import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends Frame {
    public KeyboardListener(String title){
        super(title);
        setSize(200,200);
        setVisible(true);

        Label label = new Label("Press any Key.");
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
