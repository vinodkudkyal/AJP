import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class pgm11 extends Frame {
    TextArea ta; TextField tf1 , tf2; Label l1 , l2 , l3 , l4; Button b;
    pgm11(){
        setVisible(true);
        setTitle("LOGIN PAGE");
        setLayout(null);
        setSize(600 , 600);
        l1 = new Label("LOGIN PAGE");
        l1.setBounds(250 , 100  , 200 , 50); 
        l2 = new Label("User Name");
        l2.setBounds(150 , 150 , 80 , 20);
        l3 = new Label("Password");
        l3.setBounds(150 , 200 , 80 , 20);
        l4 = new Label("Review");
        l4.setBounds(150 , 250 , 80 , 20);
        tf1 = new TextField();
        tf1.setBounds(250 , 150 , 200 , 20);
        tf2 = new TextField();
        tf2.setBounds(250 , 200 , 200 , 20);
        ta = new TextArea(4 , 100);
        ta.setBounds(250 , 250 , 200 , 100);
        b = new Button("Submit");
        b.setBounds(250 , 400 , 100 , 30);
        b.addActionListener(new ActionListener() {    
            public void actionPerformed (ActionEvent e) {    
                   System.out.println("User Name :"+tf1.getText());
                   System.out.println("Password :"+tf2.getText());
                   System.out.println("Review :"+ta.getText());
                }    
            });  
        add(l1); add(l2); add(l3); add(l4); add(tf1); add(tf2); add(ta); add(b);
    }
    public static void main(String[] args) {
        new pgm11();
    }

}
