package TP;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;
import javax.swing.plaf.FontUIResource;

class vinod_login extends Frame implements ActionListener
{
    Label l1 , l2 , l3 , l4 , l5 ;
    Button b;
    TextField t1 , t2;

    vinod_login()
    {
        Font f = new Font("Arial Orange",Font.BOLD,30);
        Font f1 = new FontUIResource("Arial Black", Font.CENTER_BASELINE, 15);
        Font f2 = new FontUIResource("Arial Black", Font.PLAIN, 20);

        l1 = new Label("****VINOD LOGIN****");
        l1.setBounds(260, 50 ,350 , 50);
        //l1.setSize(200, 50);
        l1.setFont(f);

        l2 = new Label("User Name :");
        l2.setBounds(200, 200, 80, 30);
        l2.setFont(f1);

        l3 = new Label("Password");
        l3.setBounds(200, 300, 80, 30);
        l3.setFont(f1);


        l4 = new Label();
        
        
        l5 = new Label();


        b = new Button("Submit");
        b.setBounds(350, 400, 100, 30);
        b.setFont(f2);

        b.addActionListener(this);

        t1 = new TextField();
        t1.setBounds(300, 200, 250, 30);
        t1.setFont(f2);

        t2 = new TextField();
        t2.setBounds(300, 300, 250, 30);
        t2.setFont(f2);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(b);
        add(t1);
        add(t2);

        setLayout(null);
        setVisible(true);
        setTitle("VINOD LOGIN");
        setSize(800 , 800);

    }

    public static void main(String args[]) 
    {
        new vinod_login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String uname = t1.getText();
        String pass = t2.getText();
        if(uname=="vinodkudkyal2005@gmail.com" && pass=="3045vr")
        {
            simple s = new simple();
            s.setVisible(true);
            setVisible(false);
            //awt a = new awt();
            //a.setVisible(true);
        }
        else{
           // simple s = new simple();
            //s.setVisible(true);
            //setVisible(false);
            awt a = new awt();
            a.setVisible(true);
        }
    }
}