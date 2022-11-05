import java.awt.Label;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class pgm5 {
    pgm5() {
        Frame f = new Frame();
        f.setVisible(true);
        f.setTitle("Label Programe");
        f.setSize(500 , 500);
        f.setLayout(null);
        Label l1 = new Label("1st Label");
        l1.setBounds(50 , 50 , 70 , 30);
        Label l2 = new Label();
        l2.setText("2nd Label");
        l2.setBounds(150 , 50 , 70 , 30);
        Label l3 = new Label("3rd Label");
        l3.setBounds(250 , 50 , 70 , 30);
        f.add(l1); f.add(l2); f.add(l3);
        String s1 = l1.getText();
        System.out.println(s1);
        f.addWindowListener(new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                // f.dispose();    
                f.setBackground(Color.CYAN);
            }    
        });    
    }
    public static void main(String[] args) {
        new pgm5();
    }
}