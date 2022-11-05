import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;
public class JToggleBtnpgm extends JFrame {
    JToggleBtnpgm() {
        JToggleButton jtb = new JToggleButton();
        jtb.setBounds(200 , 200 , 100 , 30);
        JLabel lb = new JLabel();
        lb.setBounds(200 , 250 , 100 , 30);
        add(jtb); add(lb);
        jtb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(jtb.isSelected()) {
                    jtb.setText("OFF");
                    lb.setText("The Bulb is OFF");
                }
                else {
                    jtb.setText("ON");
                    lb.setText("The Bulb is ON");
                }
            }
        });

        setTitle("JToggle Button Program");
        setSize(500 , 500);
        setLayout(null);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JToggleBtnpgm();
    }
}
// import java.awt.FlowLayout;  
// import java.awt.event.ItemEvent;  
// import java.awt.event.ItemListener;  
// import javax.swing.JFrame;  
// import javax.swing.JToggleButton;  
  
// public class JToggleBtnpgm extends JFrame implements ItemListener {  
//     public static void main(String[] args) {  
//         new JToggleBtnpgm();  
//     }  
//     private JToggleButton button;  
//     JToggleBtnpgm() {  
//         setTitle("JToggleButton with ItemListener Example");  
//         setLayout(new FlowLayout());  
//         setJToggleButton();  
//         setAction();  
//         setSize(200, 200);  
//         setVisible(true);  
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
//     }  
//     private void setJToggleButton() {  
//         button = new JToggleButton("ON");  
//         add(button);  
//     }  
//     private void setAction() {  
//         button.addItemListener(this);  
//     }  
//     public void itemStateChanged(ItemEvent eve) {  
//         if (button.isSelected())  
//             button.setText("OFF");  
//         else  
//             button.setText("ON");  
//     }  
// }