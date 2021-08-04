/*Write a program to create an Applet. Create a frame as a child of applet. Implement
mouseClicked( ), mouseEntered( ) and mouseExited( ) events for applet. Frame is visible
when mouse enters applet window and hidden when mouse exits from the applet window.*/
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseListener extends Frame implements java.awt.event.MouseListener {

    public MouseListener(String title) {
        super(title);
        setSize(100,100);
        setVisible(true);

        addMouseListener(this);

      addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              dispose();
          }
      });


    }


        @Override
    public void mouseClicked(MouseEvent e) {
            super.setSize(100,100);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        super.setVisible(true);
        super.setSize(300,300);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        super.setVisible(false);
        super.dispose();
    }
}
