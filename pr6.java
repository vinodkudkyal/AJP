import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.applet.Applet;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
public class pr6 extends Applet  {
    public void init() {
        String[] c = {"Solapur" , "Pune" , "Banglore" , "Mumbai"};
        JLabel a = new JLabel();
        a.setBounds(170 , 100 , 200 , 20);
        add(a);
        JComboBox<Object> city = new JComboBox<>(c);
        city.setBounds(50 , 100 , 100 , 20);
        add(city);
        city.addItemListener(new ItemListener () {
            public void itemStateChanged(ItemEvent e) {
                a.setText("You are in "+city.getSelectedItem());
            }
        });
        setLayout(null);
    }
}
/*
<applet code="pr6.class"width=500 height=500>
</applet>
*/