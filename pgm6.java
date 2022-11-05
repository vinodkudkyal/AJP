import java.awt.Frame;
import java.awt.Checkbox;
public class pgm6 extends Frame{
    pgm6(){
        setTitle("Check Box Programes");
        setVisible(true);
        setLayout(null);
        setSize(500 , 500);
        Checkbox cb = new Checkbox("Java");
        cb.setBounds(150 , 50 , 50 , 30);
        Checkbox cb1 = new Checkbox();
        cb1.setLabel("CPP");
        cb1.setBounds(150 , 80 , 50 , 30);
        Checkbox cb2 = new Checkbox("C");
        cb2.setBounds(150 , 110 , 50 , 30);
        Checkbox cb3 = new Checkbox("AJP" , true);
        cb3.setBounds(150 , 140 , 50 , 30);
        add(cb); add(cb1); add(cb3); add(cb2);
        String s = cb.getLabel();
        System.out.println("The 1st Checkbox Labe is "+s);
        Boolean b = cb3.getState();
        System.out.println("The 4th Checkbox State is "+b);
    }
    public static void main(String[] args) {
        new pgm6();
    }
}