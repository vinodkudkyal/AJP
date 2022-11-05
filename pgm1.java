import java.awt.Frame;
import java.awt.Panel;
public class pgm1 {
    pgm1() {
        Frame f = new Frame();
        System.out.println(f);
        Panel p = new Panel();
        f.add(p);
        System.out.println(p);
    }
    public static void main(String[] args) {
        new pgm1();
    }
}