package TP;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Cards extends JFrame implements ActionListener
{
    Container c;
    CardLayout cl;
     JButton prev,next,first,last;
    Cards()
    {
        Panel p = new Panel();

        BorderLayout b = new BorderLayout();
        setLayout(b);

        setBackground(Color.MAGENTA);

        cl = new CardLayout(30,30);
        p.setLayout(cl);
        c = getContentPane();

        
        JButton b1 = new JButton("King");
        JButton b2 = new JButton("queen");
        JButton b3 = new JButton("Jack");
        JButton b4 = new JButton("Thift");
        JButton b5 = new JButton("Killer");
        c.add(b1,"king");
        c.add(b2,"queen");
        c.add(b3,"Jack");
        c.add(b4,"Thift");
        c.add(b5,"Killer");
        p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);
        c.add(p,"panel");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        add(p,BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent ae)
    {
        cl.next(c);
    }
    public static void main(String args[])
    {
        Cards cd = new Cards();
        cd.setTitle("My Frame");
        cd.setVisible(true);
        cd.setSize(500,500);
    }
}