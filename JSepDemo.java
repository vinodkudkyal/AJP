/*import java.awt.*;
import javax.swing.*;
//import javax.swing.JSeparator;
public class JSepDemo extends JFrame
{ public static void main(String args[])
{ JSepDemo jf=new JSepDemo();
Container c=jf.getContentPane();
c.setLayout(new GridLayout(0,1));
JLabel jl=new JLabel("AJP",JLabel.CENTER); c.add(jl);
JSeparator js=new JSeparator();
c.add(js);
JButton jb=new JButton("CSR"); c.add(jb);
jf.setSize(300,100);
jf.setVisible(true);
} 
}
*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
public class JSepDemo extends JFrame {
    JSepDemo() {
        JLabel l = new JLabel("Its A Label");
        JSeparator sep = new JSeparator();
        JButton b = new JButton("Button");
        l.setBounds(100 , 100 , 100 , 20);
        sep.setBounds( 100, 120, 100 , 20);
        b.setBounds(100 , 150 , 100 , 20);
        add(l); add(sep); add(b);
        setVisible(true);
        setTitle("JSepareter Program");
        setLayout(null);
        setSize(500 , 500);
    }
    public static void main(String[] args) {
        new JSepDemo();
    }
}