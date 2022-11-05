import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTree;
public class Jtreepgm extends JFrame {
    Jtreepgm() {
        setVisible(true);
        setTitle("JTree Program");
        setSize(500 , 500);                                                                     
        DefaultMutableTreeNode oops = new DefaultMutableTreeNode("OOP's");
        DefaultMutableTreeNode type = new DefaultMutableTreeNode("type");
        DefaultMutableTreeNode pop = new DefaultMutableTreeNode("POP's");
        DefaultMutableTreeNode java = new DefaultMutableTreeNode("JAVA");
        DefaultMutableTreeNode fort = new DefaultMutableTreeNode("Fortran");
        DefaultMutableTreeNode cpp = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode C = new DefaultMutableTreeNode("C");
        DefaultMutableTreeNode awt = new DefaultMutableTreeNode("AWT");
        DefaultMutableTreeNode swings = new DefaultMutableTreeNode("SWING");
        DefaultMutableTreeNode button = new DefaultMutableTreeNode("BUTTON");
        DefaultMutableTreeNode frame = new DefaultMutableTreeNode("FRAME");
        DefaultMutableTreeNode jbutton = new DefaultMutableTreeNode("JBUTTON");
        DefaultMutableTreeNode jframe = new DefaultMutableTreeNode("JFRAME");
        type.add(oops);
        type.add(pop);
        oops.add(java); oops.add(cpp);
        pop.add(fort); 
        pop.add(C);
        java.add(awt); java.add(swings);
        awt.add(button); awt.add(frame); swings.add(jbutton); swings.add(jframe);
        JTree lang = new JTree(type);
        //JTree lang1 = new JTree(pop);
        add(lang);
      //  add(lang1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public static void main(String[] args) {
        new Jtreepgm();
    }
}