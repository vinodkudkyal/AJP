package TP;
import java.awt.*;
//import javax.swing.WindowConstants;

//import javax.swing.plaf.LabelUI;

class awt extends Frame
{
    // awt()
    // {
    //     Label lb = new Label("Vinod");
    //     Button bt = new Button("OK");
    //     Checkbox cb = new Checkbox("Male");
    //     TextField tf = new TextField();

    //     tf.setBounds(80 , 70 , 60 , 20);
    //     cb.setBounds(100 , 120 , 50 , 15);
    //     bt.setBounds(150, 160, 30, 20);
    //     lb.setBounds(30, 30, 40, 50);

    //     add(lb);
    //     add(bt);
    //     add(cb);
    //     add(tf);

    //     setLayout(null);
    //     setSize(500 , 500);
    //     setVisible(true);
    //     setTitle("Vinod");

    //     setDefaultCloserOpration(WindowConstants.EXIT_ON_CLOSE);
    // }
    public static void main(String args[])
    {
        Frame f = new Frame("New AWT");
        f.setVisible(true); 
        f.setSize(500  , 500);
        f.setLayout(null);   
        Label l = new Label("Welcom To JAVA");
        f.add(l);
        l.setBounds(50 , 50 , 200 , 50);
    }
}