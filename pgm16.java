import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;
public class pgm16 extends Frame {
    pgm16() {
        setVisible(true);
        setTitle("Gridlayout Program");
        setSize(500 , 500);
        GridLayout grid = new GridLayout();
        setLayout(grid);
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setRows(3);
        grid.setColumns(2);
        for(int i = 1 ; i<=5 ; i++) {
            add(new Button("Button"+i));
        }
    }
    public static void main(String[] args) {
        new pgm16();
    }
}