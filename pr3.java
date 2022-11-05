import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Button;
public class pr3 extends Frame {
    pr3() {
        GridLayout grid = new GridLayout(5 , 5);
        setVisible(true);
        setTitle("GridLayout Program");
        setSize(500 , 500);
        setLayout(grid);
        for(int i = 1 ; i <= 25 ; i++) {
            add(new Button("Button"+i));
        }
    }
    public static void main(String[] args) {
        new pr3();
    }
}
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class pr3 extends Frame {
    pr3() {
        GridLayout grid = new GridLayout(4 , 3);
        setVisible(true);
        setTitle("GridLayout 0 - 9");
        setSize(500 , 500);
        setLayout(grid);

        for(int i = 0 ; i <= 9 ; i++) {
            add(new Button(""+i));
        }
    }
    public static void main(String[] args) {
        new pr3();
    }
}
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class pr3 extends Frame {
    pr3() {
        GridLayout grid = new GridLayout(3 , 2);
        setVisible(true);
        setTitle("GridLayout Demo");
        setSize(500 , 500);
        setLayout(grid);

        for(int i = 1 ; i <= 5 ; i++) {
            add(new Button("Button "+i));
        }
    }
    public static void main(String[] args) {
        new pr3();
    }
}
import java.awt.Button;
import java.awt.Frame;
import java.awt.BorderLayout;

public class pr3 extends Frame {
    pr3() {
        setVisible(true);
        setTitle("GridLayout 0 - 9");
        setSize(500 , 500);
        add(new Button("WEST") , BorderLayout.WEST);
        add(new Button("EAST") , BorderLayout.EAST);
        add(new Button("CENTER") , BorderLayout.CENTER);
        add(new Button("NORTH") , BorderLayout.NORTH);
        add(new Button("SOUTH") , BorderLayout.SOUTH);

    }
    public static void main(String[] args) {
        new pr3();
    }
}