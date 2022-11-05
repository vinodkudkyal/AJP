import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class JTablePgm extends JFrame {
    JTablePgm() {
        String[] heads = {"Name" , "Roll NO" , "Enrollment No"};
        Object[][] data = {
            {"Vinod" , "33" , "2000150203"} ,
            {"Sonu" , "30" , "2000150203"} 
        };
        JTable jt = new JTable(data , heads);
        JScrollPane jsp = new JScrollPane(jt , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(jsp);
        setVisible(true);
        setTitle("JTable Program");
        setSize(100 , 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public static void main(String[] args) {
        new JTablePgm();
    }
}