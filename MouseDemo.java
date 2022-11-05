import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MouseDemo extends JFrame implements MouseListener{
    JLabel l;
    //Color c = new Color(153 , 255 , 153);
    MouseDemo() {
        l = new JLabel();
        add(l);
        addMouseListener(this);
        setVisible(true);
        setSize(500 , 500);
        setTitle("MouseListener Program");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {


        new MouseDemo();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("MoseClicked");
        getContentPane().setBackground(Color.ORANGE);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("MosePressed");
        getContentPane().setBackground(Color.GREEN);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("MoseReleased");
        getContentPane().setBackground(Color.CYAN);
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("MoseEntered");
        getContentPane().setBackground(Color.BLUE);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("MoseExited");
        getContentPane().setBackground(Color.RED);
    }
}