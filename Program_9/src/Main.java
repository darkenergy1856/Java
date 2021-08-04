import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {
    public Main(){
        setSize(200,100);
        setTitle("Program_9");
        setVisible(true);
        setLayout(null);
        setBackground(Color.PINK);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

       Label label = new Label("This is Program_9");
       label.setBounds(40,20,150,100);


        add(label);

    }

    public static void main(String[] args) {
        new Main();
    }
}
