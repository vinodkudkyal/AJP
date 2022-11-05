// import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
// import java.awt.GridLayout;
public class JScrollPanepgm extends JFrame {
    public JScrollPanepgm() {
        //JPanel p = new JPanel();
        // p.setLayout(new GridLayout(20 , 20));
        // int b = 1;
        // for(int i = 1; i<=20;i++) {
        //     for(int j =1;j<=20;j++) {
        //         p.add(new JButton("Button "+b));
        //         b++;
        //     }
        // }
            JTextArea ta = new JTextArea(500 , 500);
            
           // p.add(ta);
        JScrollPane js = new JScrollPane(ta , ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED , ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(js);
        setVisible(true);
        setTitle("JSrollPane Program");
        setSize(500 , 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public static void main(String[] args) {
        new JScrollPanepgm();
    }
}