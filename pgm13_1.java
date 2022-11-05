import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class pgm13_1 extends JFrame {
    JButton next , previous , first , last , king , queen , jack , ace;
    JPanel p;
    CardLayout crd;
    pgm13_1() {
        setVisible(true);
        setTitle("Card Layout Program");
        setSize(500 , 500);
        crd = new CardLayout();
        first = new JButton("FIRST");
        add(first , BorderLayout.NORTH);
        last = new JButton("LAST");
        add(last , BorderLayout.SOUTH);
        next = new JButton("NEXT");
        add(next , BorderLayout.EAST);
        previous = new JButton("PREVIOUS");
        add(previous , BorderLayout.WEST);
        p = new JPanel();
        add(p , BorderLayout.CENTER);
        p.setLayout(crd);
        king = new JButton("KING");
        p.add(king , "card1");
        queen = new JButton("QUEEN");
        p.add(queen , "card2");
        jack = new JButton("JACK");
        p.add(jack , "card3");
        ace = new JButton("ACE");
        p.add(ace , "card4");
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
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public static void main(String[] args) {
        new pgm13_1();
    }
}
