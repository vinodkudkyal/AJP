import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
public class pgm12 extends Frame{
        pgm12(){
        setTitle("FlowLaout Program");
        setLayout(new FlowLayout(FlowLayout.LEFT , 25 , 25));
        setSize(400 , 400);
        setVisible(true);
        Button b1 , b2 , b3 , b4 , b5 , b6 , b7 , b8;
        b1 = new Button("B1");
        b2 = new Button("B2");
        b3 = new Button("B3");
        b4 = new Button("B4");
        b5 = new Button("B5");
        b6 = new Button("B6");
        b7 = new Button("B7");
        b8 = new Button("B8");
        add(b1); add(b2); add(b3); add(b4); add(b5); add(b6); add(b7); add(b8);
    }
    public static void main(String[] args) {
        new pgm12();
    }    
}
