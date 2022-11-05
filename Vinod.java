package TP;

/*import java.awt.*;

class Vinod extends Frame

{
    Vinod()
    {
       // FlowLayout fl = new FlowLayout();
        //setLayout(fl);
        Label lb = new Label("Vinod");
        Button bt = new Button("Submit");

        bt.setBounds(10,20,40,50);
        lb.setBounds(30 , 10 , 30 , 30);
        
        Checkbox cb = new Checkbox("Male");
        TextField tf = new TextField();
        cb.setBounds(70,80,55,60);
        tf.setBounds(60,50,70,20);
       
        add(lb);
        add(bt);
        add(cb);
        add(tf);
     
        setTitle("I Am Vinod");
        setVisible(true);
        setSize(1000 , 1000);

    }

    public static void main(String arhs[])
    {
        new Vinod();
        
    }
}*/

import java.awt.*;  
import java.awt.event.*;  
class Vinod extends Frame implements ActionListener{  
TextField tf;  
Vinod(){  
  
//create components  
tf=new TextField();  
tf.setBounds(60,50,170,20);  
Button b=new Button("click me");  
b.setBounds(100,120,80,30);  
  
//register listener  
b.addActionListener(this);//passing current instance  
  
//add components and set size, layout and visibility  
add(b);add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
tf.setText("I Am Vinod");  
}  
public static void main(String args[]){  
new Vinod();  
}  
}  