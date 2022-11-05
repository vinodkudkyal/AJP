import javax.swing.JFrame;
//import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
public class registrationpage extends JFrame{
    public registrationpage(){
        setSize(500,500);
        setLayout(null);
        setTitle("Registration Page");
        JLabel l1=new JLabel("FirstName");
        l1.setBounds(100,50,70,20);
        JLabel l5=new JLabel("LastName");
        l5.setBounds(100,90,70,20);
        JLabel l4=new JLabel("MobileNo");
        l4.setBounds(100,170,70,20);
        JLabel l6=new JLabel("Emailid");
        l6.setBounds(100,210,70,20);
        JLabel l2=new JLabel("Address");
        l2.setBounds(100,250,70,20);
        JLabel l3=new JLabel("Gender");
        l3.setBounds(100,130,70,20);
        add(l1);
         add(l2);
          add(l3);
           add(l4);
            add(l5);
              add(l6);
              JTextField  t1,t2,t3,t4;
              t1=new JTextField();
              t1.setBounds(200,50,100,20);
              add(t1);
              t2=new JTextField();
              t2.setBounds(200,90,100,20);
              add(t2);
              t3=new JTextField(10);
              t3.setBounds(200,170,100,20);
              add(t3);
              t4=new JTextField();
              t4.setBounds(200,210,100,20);
              add(t4);
              JRadioButton rd1,rd2;
              rd1=new JRadioButton("Male");
              rd1.setBounds(200,130,90,20);
              add(rd1);
              rd2=new JRadioButton("Female");
              rd2.setBounds(300,130,90,20);
              add(rd2);
              setVisible(true);
       
    }
    public static void main(String args[]){
        new registrationpage();
    }
}