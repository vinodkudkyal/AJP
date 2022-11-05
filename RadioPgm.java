import javax.swing.JFrame;
import javax.swing.JRadioButton;
public class RadioPgm extends JFrame {
    RadioPgm() {
        JRadioButton n = new JRadioButton("Radio");
        add(n);
        System.out.println(n);
        setVisible(true);
        setTitle("RadioButton Program");
        setLayout(null);
        setSize(500 , 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public static void main(String[] args) {
        new RadioPgm();
    }
}
