import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JToolTip;
public class JTooltippgm extends JFrame {
    JTooltippgm() {
        JButton jb = new JButton("submit");
        JToolTip jtp = new JToolTip();
        jb.setToolTipText("Submit btn");
        add(jb , BorderLayout.NORTH); add(jtp);
        setVisible(true);
        setTitle("JToolTip Program");
        setSize(500 , 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   }
    public static void main(String[] args) {
        new JTooltippgm();
    }
}