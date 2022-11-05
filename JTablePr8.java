/*import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class JTablePr8 extends JFrame {
    public static void main(String[] args) {
        JTablePr8 jtd = new JTablePr8();
        String[] heads = {"No" , "Name" , "DOB"};
        String[][] data = {{"30" , "Vinod" , "30/05/2005"} , {"04" , "Kanna" , "04/05/2005"} , {"3045" , "Viru" , ""}};
        JTable jt = new JTable(data , heads);
        JScrollPane jsp = new JScrollPane(jt , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jtd.add(jsp);
        jtd.setVisible(true);
        jtd.setSize(500 , 500);
        jtd.setTitle("JTable Program");
    }
}*/

/*import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class JTablePr8 extends JFrame {
    public static void main(String[] args) {
        JTablePr8 jtd = new JTablePr8();
        String[] heads = {"ID" , "NAME" , "SALARY"};
        String[][] data = {{"101" , "Amit" , "670000"} , {"102" , "Jai" , "780000"} , {"101" , "Sachin" , "700000"}};
        JTable jt = new JTable(data , heads);
        JScrollPane jsp = new JScrollPane(jt , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jtd.add(jsp);
        jtd.setVisible(true);
        jtd.setSize(500 , 500);
        jtd.setTitle("JTable Program");
    }
}*/

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class JTablePr8 extends JFrame {
    public static void main(String[] args) {
        JTablePr8 jtd = new JTablePr8();
        DefaultTableModel rowdata = new DefaultTableModel();
        JTable jt = new JTable(rowdata);
        rowdata.addColumn("No"); rowdata.addColumn("Name"); rowdata.addColumn("DOB");
        rowdata.insertRow(0 , new Object[]{"30" , "Vinod" , "30/05/2005"}); 
        rowdata.insertRow(1 , new Object[]{"04" , "Kanna" , "04/05/2005"});
        rowdata.insertRow(2 , new Object[]{"3045" , "Viru" , ""});
        JScrollPane jsp = new JScrollPane(jt , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jtd.add(jsp);
        jtd.setVisible(true);
        jtd.setSize(500 , 500);
        jtd.setTitle("JTable Program");
    }
}