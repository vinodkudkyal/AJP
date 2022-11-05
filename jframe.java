package TP;
import javax.swing.JFrame;
//import javax.swing.plaf.LabelUI;

import java.awt.*;

public class jframe extends JFrame
{
    jframe()
    {
        Button b = new Button("Submit");
        Label l = new Label("Welcome To Java");
        

        b.setBounds(50, 50, 100, 30);
        add(b);
        l.setBounds(50, 50, 100, 30);
        add(l);

        setVisible(true);
        setSize(500 , 500);
        setTitle("JFrame");
        setLayout(null);
    }
    public static void main(String[] args) 
    {
        new jframe();   
    }
}