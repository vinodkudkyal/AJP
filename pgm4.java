import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Label;
public class pgm4 extends Frame {
    pgm4() {
        setTitle("Panel Programe");
        setVisible(true);
        setSize(500 , 500);
        setLayout(null);
        Panel p = new Panel();
        p.setBackground(Color.GRAY);
        p.setBounds(100 , 100 , 200 , 200);
        Label l = new Label("This is a Panel");
        p.add(l);
        add(p);
    }   
    public static void main(String[] args) {
        new pgm4();
    } 
}

