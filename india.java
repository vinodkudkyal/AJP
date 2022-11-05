package TP;
import java.awt.*;
public class india extends Frame 
{
    india()
    {
        setVisible(true);
        setTitle("title");
        setLayout(null);
        setSize(500 , 500);
        
        Label l = new Label("I AM VINOD");
        l.setBounds(50, 50, 50, 50);
        add(l);

        
    }
    public static void main(String[] args) {
        new india();
    }
}
