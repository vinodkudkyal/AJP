import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
public class Registrationpgm extends JFrame {
    Registrationpgm() {
        String[] st = {"CM" , "IT" , "ME" , "CE" , "ENTC" , "EE"};
        String[] lang = {"C" , "C++" , "HTML" , "CSS" , "JS" , "JAVA" , "Advance JAVA" , "PYTHON"};
       
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\VINOD\\OneDrive\\Pictures\\images project\\kindpng_1468338-modified-modified.png");
        setIconImage(icon); 
        JLabel ti = new JLabel("Regesitration Page");
        ti.setBounds(200 , 40 , 400 , 50);
        JLabel name = new JLabel("Name");
        // Icon im = new ImageIcon("C:\\Users\\VINOD\\OneDrive\\Pictures\\images project\\kindpng_1468338-modified-modified.png");
        // name.setIcon(im); 
        name.setBounds(30 , 100 , 50 , 20);
        JTextField namet = new JTextField();
        namet.setBounds(100 , 100 , 200 , 20);
        JLabel addr = new JLabel("Address");
        addr.setBounds(30 , 150 , 50 , 20);
        JTextArea addrt = new JTextArea(4 , 50);
        addrt.setBounds(100 , 150 , 200 , 100);
        JLabel branch = new JLabel("Branch");
        branch.setBounds(30 , 300 , 50 , 20);
        JComboBox<Object> brc = new JComboBox<Object>(st);
        brc.setBounds(100 , 300 , 100 , 20);
        JLabel gen = new JLabel("Gender");
        gen.setBounds(30 , 350 , 50 , 20);
        ButtonGroup rbg = new ButtonGroup();
        JRadioButton m = new JRadioButton("Male");
        JRadioButton f = new JRadioButton("Female");
        JRadioButton o = new JRadioButton("Other");
        rbg.add(m); rbg.add(f); rbg.add(o);
        m.setBounds(100 , 350 , 80 , 20);
        f.setBounds(190 , 350 , 80 , 20);
        o.setBounds(290 , 350 , 80 , 20);
        JButton sub = new JButton("Submit");
        sub.setBounds(200 , 400 , 100 , 50);
        sub.addActionListener(new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                System.out.println("Welcom "+namet.getText());
            }
        });
        JLabel lan = new JLabel("Select Languages");
        lan.setBounds(30 , 100 , 120 , 20);
        // JList prolang = new JList<>(lang);
        JList<Object> prolang = new JList<Object>(lang);
        prolang.setBounds(500 , 100 , 80 , 50);

        add(name); add(ti); add(namet); add(addr); add(addrt); add(branch); add(brc); add(gen); add(m); add(f); add(o); add(sub); add(prolang); add(lan);
        setVisible(true);
        setSize(600 , 600);
        setLayout(null);
        setTitle("Registration Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public static void main(String[] args) {
        new Registrationpgm();    
    }
}