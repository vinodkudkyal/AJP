/*import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class pr4 extends JFrame implements ActionListener
{
CardLayout card; 
JButton b1, b2, b3; 
Container c; 
pr4()
{
c=getContentPane(); 
card=new CardLayout(40,30); 
//create CardLayout object with 40 hor space and 30 ver space 
c.setLayout(card); 
b1=new JButton("Apple"); 
b2=new JButton("Boy"); 
b3=new JButton("Cat"); 
b1.addActionListener(this); 
b2.addActionListener(this); 
b3.addActionListener(this); 
c.add("a",b1);c.add("b",b2);c.add("c",b3); 
}
public void actionPerformed(ActionEvent e)
{
card.next(c); 
}
public static void main(String[] args)
{
pr4 p4 = new pr4(); 
p4.setSize(400,400); 
p4.setVisible(true); 
p4.setDefaultCloseOperation(EXIT_ON_CLOSE); 
} 
}*/
import java.awt.Frame;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
public class pr4 extends Frame {
    //Button B1 , B2 , B3 , B4 , B5;
    pr4() {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setVisible(true);
        setTitle("GridBag Layout Example");
        setSize(300 , 300);
        setLayout(gbl);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new Button("Button One") , gbc);
        gbc.gridx = 1;  
        gbc.gridy = 0;  
        // gbc.gridheight = 2;
        // gbc.gridwidth = 2;
        add(new Button("Button two"), gbc);  
        gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.ipady = 20;  
        gbc.gridx = 0;  
        gbc.gridy = 1;  
        add(new Button("Button Three"), gbc);  
        gbc.gridx = 1;  
        gbc.gridy = 1;  
        add(new Button("Button Four"), gbc);  
        gbc.gridx = 0;  
        gbc.gridy = 2;  
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        //gbc.gridheight = 3;
        //gbc.ipadx = 30;
        gbc.ipady = 20; 
        gbc.gridwidth = 4;  
        add(new Button("Button Five"), gbc);  
        
    }
    public static void main(String[] args) {
        new pr4();
    }
}