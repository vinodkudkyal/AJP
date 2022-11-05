import java.awt.Frame;
import java.awt.Choice;
import java.awt.Label;
public class pgm9 extends Frame 
{
    pgm9(){
        setVisible(true);
        setTitle("Choice Program");
        setLayout(null);
        setSize(500 , 500);
        Label l = new Label("Day in A week");
        l.setBounds(100 , 200 , 100 , 30);
        Choice c = new Choice();
        c.add("Sunday");
        c.add("Monday");
        c.add("Tuseday");
        c.add("Wednesday");
        c.add("Thursday");
        c.add("Friday");
        c.add("Saturday");
        c.setBounds(200 , 200 , 80 , 40);
        add(c); add(l);
        System.out.println("Selected Index is "+c.getSelectedIndex());
        System.out.println("selected Item is "+c.getSelectedItem());

    }
    public static void main(String[] args) {
        new pgm9();
    }
}
