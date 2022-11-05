import java.awt.Frame;
import java.awt.Button;
public class pgm7 extends Frame {
    pgm7(){
        setVisible(true);
        setSize(500 , 500);
        setLayout(null);
        setTitle("Button Programe");

        Button b1 = new Button("OK");
        b1.setBounds(100 , 50 , 50 , 30);

        Button b2 = new Button();
        b2.setLabel("Change");
        b2.setBounds(200 , 50 , 80 , 30);
        add(b1); add(b2);

        String s = b1.getLabel();
        System.out.println(s);
    }
    public static void main(String[] args) {
        new pgm7();
    }
}
