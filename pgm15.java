import java.awt.Frame;
import java.awt.Button;
import java.awt.CardLayout;
public class pgm15 extends Frame {
    Button b1 , b2 , b3 , b4 , b5;
    pgm15() {
        setVisible(true);
        setTitle("Crad Laout Program");
        setLayout(new CardLayout());
        setSize(500 , 500);
        b1 = new Button("First");
        b2 = new Button("Second");
        b3 = new Button("Third");
        b4 = new Button("Fourth");
        b5 = new Button("Fifth");
        add(b1 , "card5");
        add(b2 , "card4");
        add(b3 , "card3");
        add(b4 , "card2");
        add(b5 , "card1");
        
    }
    public static void main(String[] a) {
        new pgm15();
    }
}