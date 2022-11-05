import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
public class JTabbedPanepgm extends JFrame {
    JTabbedPanepgm() {
        String[] c = {"Bugati" , "Lamborgini" , "Farrari"};
        JTabbedPane pane = new JTabbedPane();
        JPanel p1 = new JPanel();
        
        p1.add(new JButton("Black"));
        p1.add(new JButton("Red"));
        p1.add(new JButton("Yellow"));
        JPanel p2 = new JPanel();
        p2.add(new JCheckBox("Apple"));
        p2.add(new JCheckBox("Mango"));
        p2.add(new JCheckBox("Banana"));
        JPanel p3 = new JPanel();
        p3.add(new JComboBox<>(c));
        pane.addTab("Color", p1);
        pane.addTab("Fruit", p2);
        pane.addTab("Cars", p3);
        add(pane);
        setVisible(true);
        setTitle("JTabbedPane Program");
        setSize(500 , 500);
     }
    public static void main(String[] args) {
        new JTabbedPanepgm();
    }
}