import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class pgm13 extends Frame {
    Button first , last , next , previous , king , queen , jack , ace;
    Panel p;
    CardLayout crd;
    pgm13() {
        setVisible(true);
        setTitle("Card Layout Program");
        setSize(500 , 500);
        crd = new CardLayout();
        first = new Button("FIRST");
        add(first , BorderLayout.NORTH);
        last = new Button("LAST");
        add(last , BorderLayout.SOUTH);
        next = new Button("NEXT");
        add(next , BorderLayout.EAST);
        previous = new Button("PREVIOUS");
        add(previous , BorderLayout.WEST);
        p = new Panel();
        add(p , BorderLayout.CENTER);
        p.setLayout(crd);
        king = new Button("KING");
        p.add(king , "card1");
        queen = new Button("QUEEN");
        p.add(queen , "card2");
        jack = new Button("JACK");
        p.add(jack , "card3");
        ace = new Button("ACE");
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
    }
    public static void main(String[] args) {
        new pgm13();
    }
}