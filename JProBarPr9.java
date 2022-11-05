/*import javax.swing.JFrame;
import javax.swing.JProgressBar;
public class JProBarPr9 extends JFrame {
    int i = 0; JProgressBar jp;
    JProBarPr9() {
        jp = new JProgressBar(0 , 1000);
        jp.setBounds(150 , 350 , 200 , 30);
        jp.setValue(0);
        jp.setStringPainted(true);
        add(jp);
       // iterate();
        setLayout(null);
        setSize(500 , 500);
        setTitle("JPrograssBar Program");
        setVisible(true);
    }
    public void iterate() {
        while(i <= 1000) {
            jp.setValue(i);
            i = i + 10;
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        JProBarPr9 jpd = new JProBarPr9();
        jpd.iterate();
    }
}*/

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
public class JProBarPr9 extends JFrame {
    int i = 0; JProgressBar jp; JButton b = new JButton("Submit");
    JProBarPr9() {
        jp = new JProgressBar(0 , 100);
        jp.setValue(i);
        jp.setStringPainted(true);
        jp.setBounds(150 , 350 , 200 , 30);
        b.setBounds(200 , 300 , 100 , 30);
        jp.setVisible(false);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b) {
                    jp.setVisible(true);
                    try {
                        while (i <= 1000) {
                            Thread.sleep(50);
                            jp.paintImmediately(0, 0, 200, 50);
                            jp.setValue(i);
                            i += 10;
                        }
                    } catch (Exception ea) {
                        ea.printStackTrace();
                    }
                }

            }
        });
        add(jp); add(b);
       // iterate();
        setLayout(null);
        setSize(500 , 500);
        setTitle("JPrograssBar Program");
        setVisible(true);
    }
    public static void main(String[] args) {
        new JProBarPr9();
    }
}