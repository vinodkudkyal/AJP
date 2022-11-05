import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import javax.swing.ScrollPaneConstants;
class Scrollpanepr6 extends JFrame {
    Scrollpanepr6() {
        JTextArea ta = new JTextArea(500, 200);
        //ta.setBounds(100 , 100 , 50 , 30);
        JScrollPane sp = new JScrollPane(ta , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBounds(100 , 100 , 200 , 100);
        add(sp);
        setTitle("ScrollPane Program Pr60");
        setSize(500 , 500);
        setLayout(null);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public static void main(String[] args) {
        new Scrollpanepr6();
    }
}