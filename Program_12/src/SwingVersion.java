import javax.swing.*;
import java.awt.*;

public class SwingVersion {

    String name , collegeName , courseName ;
    long rollNo;
    double cgpa;

    public SwingVersion(String name, String collegeName, String courseName, long rollNo, double cgpa) {
        this.name = name;
        this.collegeName = collegeName;
        this.courseName = courseName;
        this.rollNo = rollNo;
        this.cgpa = cgpa;

        JFrame jFrame = new JFrame(name);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(400,400));
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        JPanel p = new JPanel();


        JButton button1 = new JButton("A");
        JButton button2 = new JButton("B");

        button1.setBounds(40 , 80 , 100 , 100);
        button2.setBounds(180 , 80 , 100 , 100 );


        button1.addActionListener(e -> {
            JLabel jLabel = new JLabel(displayRecord());
            jLabel.setVisible(true);
            p.add(jLabel);

        });

        button2.addActionListener(e -> {

            JLabel label = new JLabel(cgpaRecord());
            label.setVisible(true);
            p.add(label);



        });

        jFrame.getContentPane().add(button1);
        jFrame.getContentPane().add(button2);
        jFrame.getContentPane().add(p);
        jFrame.pack();

    }


    public String displayRecord() {

        String record;

        record = "Name: "+ this.name + " \nRoll No : " + this.rollNo + " \nCollege Name : " + this.collegeName + " \nCourse Name : " + this.courseName;
        return record;
    }

    public String cgpaRecord(){
        return "CGPA to " + this.name + " is " + this.cgpa;

    }
}
