import java.awt.Frame;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
import java.awt.Label;
public class pgm8 extends Frame {
    pgm8() {
        setTitle("Checkbox Group Program");
        setLayout(null);
        setSize(500 , 500);
        setVisible(true);
        Label l = new Label("Gender :");
        l.setBounds(50 , 100 , 60, 30);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("Male" , true , cbg);
        cb1.setBounds(150 , 100 , 60 , 30 );
        Checkbox cb2 = new Checkbox("Female" , cbg , false);
        cb2.setBounds(220 , 100 , 60 , 30 );
        Checkbox cb3 = new Checkbox("Other" , false , cbg);
        cb3.setBounds(300 , 100 , 60 , 30);
        add(cb1); add(cb2); add(cb3); add(l);
        System.out.println("The Label is "+cb1.getLabel());
        System.out.println("The State is "+cb1.getState());
    }
    public static void main(String[] args) {
        new pgm8();
    }
}
