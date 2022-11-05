package TP;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.ImageIcon;

class simple extends Frame implements ActionListener
{
    String name , age;
    TextField tf1;
    TextField tf2;
    Label lb1;
    Label lb2;
    Label lb3;
   // Label lb4;
    Button bt;

    simple()
    {
        //setBackground(Color.blue);
        //setForeground(Color.BLACK);


        lb1 = new Label("Name");
        lb2 = new Label("Age");
        lb3 = new Label();
       // lb4 = new Label();

       // ((Object) lb4).setIcon(new ImageIcon("C:\\Users\\VINOD\\Downloads\\vaccine-tracker.jpg"));

        tf1 = new TextField();
        tf2 = new TextField();

        bt = new Button("Submit");

        lb1.setBounds(100 , 100 , 40 , 20);
        lb2.setBounds(100 , 160 , 40 , 20);
        lb3.setBounds(250 , 250 , 100, 20);
       // lb3.setBounds(250 , 300 , 80, 20);

        tf1.setBounds(150 , 100 , 100 , 20);
        tf2.setBounds(150 , 160 , 100 , 20);

        bt.setBounds(150 , 200 , 60 , 20);

        bt.addActionListener((ActionListener) this);

        add(lb1);
        add(lb2);
        add(lb3);
      //  add(lb4);
        add(tf1);
        add(tf2);
        add(bt);

        setLayout(null);
        setVisible(true);
        setTitle("I AM VINOD");
        setSize(500 , 800);
    }

    public static void main(String args[])
    {
        new simple();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        name = tf1.getText();
        age = tf2.getText();

        lb3.setText(name+" "+age);
        lb3.setForeground(Color.red);
        lb3.setVisible(true);

       // Vinod v = new Vinod();
        //v.setVisible(true);
       // setVisible(false);
    }
}