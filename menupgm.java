import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.MenuBar;
import java.awt.Menu;
public class menupgm extends Frame {
    menupgm() {
        setVisible(true);
        setTitle("Menu Program");
        setSize(500 , 500);
        setLayout(null);
        MenuBar mb = new MenuBar();
        Menu color = new Menu("Color");
        Menu subcolor = new Menu("Sub Color");
        MenuItem c1 = new MenuItem("Black");
        c1.setEnabled(false);
        MenuItem c2 = new MenuItem("Red");
        MenuItem c3 = new MenuItem("Orange");      
        MenuItem c4 = new MenuItem("Yellow");
        MenuItem c5 = new MenuItem("Green");
        MenuItem c6 = new MenuItem("Blue");
        MenuItem c7 = new MenuItem("Indigo");
        MenuItem c8 = new MenuItem("Violet");
        MenuItem c9 = new MenuItem("Pink");
        MenuItem c10 = new MenuItem("Gray");
        MenuItem sc1 = new MenuItem("Dark Black");
        MenuItem sc2 = new MenuItem("Dark Gry");
        MenuItem sc3 = new MenuItem("Dark Bule");
        MenuItem sc4 = new MenuItem("Dark Red");
        subcolor.add(sc1); subcolor.add(sc2); subcolor.add(sc3); subcolor.add(sc4);
        color.add(c1); color.add(c2); color.add(c3); color.add(c4); color.add(c5); 
        color.add(c6); color.add(c7); color.add(c8); color.add(c9); color.add(c10); 
        color.add(subcolor);
        Menu animal = new Menu("Animal");
        MenuItem a1 = new MenuItem("Lion");
        MenuItem a2 = new MenuItem("Tiger");
        MenuItem a3 = new MenuItem("Black Panthar");
        MenuItem a4 = new MenuItem("Cheeta");
        MenuItem a5 = new MenuItem("Lepard");

        animal.add(a1); animal.add(a2); animal.add(a3); animal.add(a4); animal.add(a5);
        mb.add(color); mb.add(animal);
        setMenuBar(mb);
    }
    public static void main(String[] args) {
        new menupgm();
    }
}
