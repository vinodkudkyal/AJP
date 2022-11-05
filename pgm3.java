import java.awt.Frame;
import java.awt.FlowLayout;
class pgm3 extends Frame {
    public static void main(String[] args) {
        pgm3 p3 = new pgm3();
        p3.setTitle("Extending Frame");
        p3.setLayout(new FlowLayout());
        p3.setVisible(true);
        p3.setSize(500 , 500);
    }
}