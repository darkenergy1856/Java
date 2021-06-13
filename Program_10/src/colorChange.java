import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class colorChange extends Frame {

    public colorChange() {

        Button button_1 = new Button("Red");
        Button button_2 = new Button("Blue");

        button_1.setBounds(40,40,100,100);
        button_2.setBounds(150,40,100,100);

        add(button_1);
        add(button_2);

        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.red);
            }
        });

        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.blue);
            }
        });




        setLayout(null);
        setTitle("Program_10");
        setSize(300,200);
        setVisible(true);

       addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               Frame frame = (Frame)e.getSource();
               frame.dispose();
           }
       });

    }

    public static void main(String[] args) {
        new colorChange();
    }
}