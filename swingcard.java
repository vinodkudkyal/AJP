import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class swingcard extends JFrame {
    JButton next , previous , first , last , king , queen , jack , acs;
    swingcard() {
        Container c = getContentPane();
        CardLayout crd = new CardLayout();
        
        next = new JButton("NEXT");
        c.add(next , BorderLayout.EAST);
        previous = new JButton("PREVIOUS");
        c.add(previous , BorderLayout.WEST);
        first = new JButton("FIRST");
        c.add(first , BorderLayout.NORTH);
        last = new JButton("LAST");
        c.add(last , BorderLayout.SOUTH);
        JPanel p = new JPanel();
        p.setLayout(crd);
        c.add(p , BorderLayout.CENTER);
        king = new JButton("KING");
        p.add(king , "card1");
        queen = new JButton("QUEEN");
        p.add(queen , "card2");
        jack = new JButton("JACK");
        p.add(jack , "card3");
        acs = new JButton("ACS");
        p.add(acs , "card4");
        next.addActionListener(new ActionListener() {    
            public void actionPerformed (ActionEvent e) {    
                    crd.next(p);
                }    
            });  
        previous.addActionListener(new ActionListener() {    
            public void actionPerformed (ActionEvent e) {    
                    crd.previous(p);
                }    
            });  
        first.addActionListener(new ActionListener() {    
            public void actionPerformed (ActionEvent e) {    
                   crd.first(p);
                }    
            }); 
        last.addActionListener(new ActionListener() {    
            public void actionPerformed (ActionEvent e) {    
                    crd.last(p);
                }    
            });  
            setVisible(true);
            setTitle("Swing Card Program");
            setSize(500 , 500);
    }
    public static void main(String[] args) {
        new swingcard();
    }
}