import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;
public class pgm14 extends Frame {
    Button b1 , b2 , b3 , b4 , b5;
    pgm14() {
        setVisible(true);
        setTitle("Border Layout Program");
        setSize(500 , 500);
        
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");
        add(b1 , BorderLayout.NORTH);
        add(b2 , BorderLayout.WEST);
        add(b3 , BorderLayout.EAST);
        add(b4 , BorderLayout.CENTER);
        add(b5 , BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        new pgm14();
    }
}