import java.awt.Frame;
public class pgm2 {
    pgm2() {
        Frame f = new Frame("Instantiating Frame");
        f.setVisible(true);
        f.setSize(500 , 500);
        f.setLayout(null);
    }
    public static void main(String[] args) {
        new pgm2();
    }
}
