// import java.awt.Frame;
// import java.awt.Checkbox;
// import java.awt.CheckboxGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
public class RadioCheckbox extends JFrame {
    RadioCheckbox() {
        setVisible(true);
        setTitle("Radio And CheckBox Program");
        setSize(500 , 500);
        setLayout(null);
        // CheckboxGroup cbg = new CheckboxGroup();
        // Checkbox cb1 = new Checkbox("Java" , true , cbg);
        // Checkbox cb2 = new Checkbox("Swing" , cbg , false);
        // Checkbox cb3 = new Checkbox("Sarvalet" , cbg , false);
        // cb1.setBounds(100 , 100 , 60 , 30);
        // cb2.setBounds(160 , 100 , 60 , 30);
        // cb3.setBounds(220 , 100 , 60 , 30);
        // add(cb1); add(cb2); add(cb3);
        JRadioButton rb1 = new JRadioButton("Java");
        JRadioButton rb2 = new JRadioButton("Swing");
        add(rb1); add(rb2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    

    }
    public static void main(String[] args) {
        new RadioCheckbox();
    }
}