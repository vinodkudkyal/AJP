import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
public class Password extends JFrame implements ActionListener{
    JPasswordField pass;   JButton show;
    Password(){
        show = new JButton("Show");
        pass = new JPasswordField();
        show.addActionListener(this);    
            
            show.setBounds(100 , 100 , 100 , 20);
            pass.setBounds(200, 200, 200, 30);
           add(pass); add(show); 
        setTitle("Password Field Program");
        setLayout(null);
        setSize(500 , 500);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent e) {  
        String s = e.getActionCommand();
        if (s.equals("Show")) {
             pass.setEchoChar((char)0);
             show.setText("Hide");
        }
            else if(s.equals("Hide")) {
                pass.setEchoChar('*');
                show.setText("Show");
            }
         }    
    public static void main(String[] args) {
        new Password();
    }
}