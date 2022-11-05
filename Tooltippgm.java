import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Tooltippgm extends JFrame {
    Tooltippgm() {
        JButton jb = new JButton("Submit");
        jb.setToolTipText("Submit Btn");
        jb.setBounds(250 , 250 , 100 , 30);
        JLabel lb = new JLabel("Name");
        lb.setToolTipText("Name Label");
        lb.setBounds(100 , 100 , 100 , 30);
        add(jb); add(lb);
        
        setLayout(null);
        setTitle("ToolTip Program");
        setSize(500 , 500);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
    new Tooltippgm();
    }
}