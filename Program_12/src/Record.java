/*
Using AWT, write a program to create two buttons labelled ‘A’ and ‘B’. When button ‘A’
is pressed, it displays your personal information (Name, Course, Roll No, College) and
when button ‘B’ is pressed, it displays your CGPA in previous semester.
*/


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Record extends Frame {

    String name , collegeName , courseName ;
    long rollNo;
    double cgpa;

    public Record(String name , String collegeName , String courseName , long rollNo , double cgpa) {

        super(name);
        this.name = name;
        this.collegeName = collegeName ;
        this.courseName = courseName;
        this.rollNo = rollNo;
        this.cgpa = cgpa;


        final TextArea[] textArea = new TextArea[2];

        setVisible(true);
        setSize(400,400);
        setLayout(null);

        Button button1 = new Button("A");
        Button button2 = new Button("B");

        button1.setBounds(40 , 80 , 100 , 100);
        button2.setBounds(180 , 80 , 100 , 100 );



        button1.addActionListener(e -> {
            textArea[0] = new TextArea(displayRecord());
            textArea[0].setBounds(40 , 200 , 240 , 130 );
            add(textArea[0]);
        });

        button2.addActionListener(e -> {

            textArea[1] = new TextArea(cgpaRecord());
            textArea[1].setBounds(40 , 200 , 240 , 130 );
            textArea[0].setVisible(false);
            add(textArea[1]);

        });


        add(button1);
        add(button2);


       addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               dispose();
           }
       });

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