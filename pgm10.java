import java.awt.Frame;
import java.awt.List;
import java.awt.Label;
public class pgm10 extends Frame {
    pgm10() {
        setVisible(true);
        setLayout(null);
        setTitle("List Program");
        setSize(500 , 500);
        List l = new List(12 , false);
        Label lb = new Label("Select Months");
        lb.setBounds(100 , 100 , 100 , 30);
        l.setBounds(200 , 100 , 100 , 175);
        l.add("Janaury",0) ;
        l.add("February");
        l.add("March");
        l.add("April",3);
        l.add("May",4);
        l.add("June",5);
        l.add("July");
        l.add("August");
        l.add("September");
        l.add("October");
        l.add("November");
        l.add("December");
        add(l); add(lb);
        System.out.println("Select Item "+l.getSelectedIndex());
        System.out.println("Selected Indexes "+l.getSelectedIndex());
        System.out.println("Selected Index "+l.getSelectedIndex());
        System.out.println("Selected Items"+l.getSelectedItems());
    }
    public static void main(String[] args) {
        new pgm10();
    }
}