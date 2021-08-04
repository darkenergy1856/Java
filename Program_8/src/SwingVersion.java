import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SwingVersion extends JFrame implements MouseListener {
    public SwingVersion(String title){
        super(title);
        setSize(100,100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(this);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.setSize(100,100);
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

    @Override
    public void mouseClicked(MouseEvent e) {

    }
}

