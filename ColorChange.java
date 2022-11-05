import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
public class ColorChange extends JFrame {
    JButton red , black;
    ColorChange() {
        red = new JButton("Red");
        black = new JButton("Black");
        red.setBounds(100 , 100 , 100 , 30);
        black.setBounds(250 , 100 , 100 , 30);
        add(red); 
        add(black);
        red.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.RED);
            }
        }); black.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.BLACK);
            }
            });
        setVisible(true);
        setLayout(null);
        setTitle("Color Change Program");
        setSize(500 , 500);
    }
    public static void main(String[] args) {
        new ColorChange();
    }
}