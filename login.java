package TP;
import java.awt.*;
import java.awt.event.*;

class login extends Frame implements ActionListener
{
   Label L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14;
   Button b1;
   TextField tf1,tf2,tf3; 
   Checkbox c1,c2;
   CheckboxGroup cbg;
   login()
   {
	   setLayout(null);
	   setBackground(Color.blue);
	   setForeground(Color.black);
	   Font f1=new Font("Arial Black",Font.BOLD|Font.ITALIC,25);
	   Font f2=new Font("Arial Black",Font.BOLD,15);
	   
	   L1=new Label("Collecting Information",Label.CENTER);
	   L1.setFont(f1);
	   L1.setBackground(Color.yellow);
	   setFont(f2);
	   L2=new Label("Enter Name:",Label.RIGHT);
	   L3=new Label("Select Gender:",Label.RIGHT);
	   L4=new Label("Enter Mobile Number:",Label.RIGHT);
	   L5=new Label("Enter City:",Label.RIGHT);
	   
	   
	   L6=new Label();
	   L6.setForeground(Color.red);
	   
	   L7=new Label();
	   L8=new Label();
	   L9=new Label();
	   L10=new Label();
	   L11=new Label();
	   L12=new Label();
	   L13=new Label();
	   L14=new Label();
	   
	   L7.setForeground(Color.red);
	   L8.setForeground(Color.red);
	   L9.setForeground(Color.red);
	   L10.setForeground(Color.red);

	   Button b1=new Button("Submit");
	   tf1=new TextField(20);
	   tf2=new TextField(20); 
	   tf3=new TextField(20);
	   cbg=new CheckboxGroup();
	   c1=new Checkbox("Male",false,cbg);
	   c2=new Checkbox("Female",false,cbg);

	   L1.setBounds(150,100,400,40);
	   L2.setBounds(100,200,150,40);
	   tf1.setBounds(300,200,150,40);
	   L3.setBounds(100,250,150,40);
	   c1.setBounds(300,250,60,40);
	   c2.setBounds(400,250,100,40);
	   L4.setBounds(100,300,170,40);
	   tf2.setBounds(300,300,150,40);
	   L5.setBounds(100,350,150,40);
	   tf3.setBounds(300,350,150,40);
	   b1.setBounds(150,420,150,40);
	   L6.setBounds(350,420,500,40);
	   L7.setBounds(100,500,150,40);
	   L8.setBounds(300,500,150,40); 
	   L9.setBounds(500,500,150,40); 
	   L10.setBounds(700,500,150,40); 
   	   L11.setBounds(100,550,150,40);
	   L12.setBounds(300,550,150,40);
   	   L13.setBounds(500,550,150,40);
   	   L14.setBounds(700,550,150,40);
	   
	   b1.addActionListener(this);
	   
	   add(L1);add(L2);add(L3);
	   add(L4);add(L5);add(L6);
	   add(L7);add(L8);add(L9);
	   add(L10);add(L11);add(L12);
	   add(L13);add(L14);
	   add(b1);
	   add(tf1);add(tf2);add(tf3);
	   add(c1);add(c2);   	   
   }
   public void actionPerformed(ActionEvent ae)
   {
	   L7.setText("NAME");
	   L6.setText("Your Records Submitted Successfully!!!");
	   L8.setText("GENDER");
	   L9.setText("MOBILE");
	   L10.setText("CITY");
	   L11.setText(tf1.getText());
	   L13.setText(tf2.getText());
	   L14.setText(tf3.getText());
	   L12.setText(cbg.getSelectedCheckbox().getLabel());
	}
   public static void main(String args[])
   {
    login l = new login();
	l.setVisible(true);
	l.setTitle("Vinod Collection");
	l.setSize(900,800);
   }
}

