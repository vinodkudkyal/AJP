import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Button;
public class pgm17 extends Frame {
    pgm17() {
        setVisible(true);
        setTitle("GridBagLayout Program");
        setSize(500 , 500);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(new Button("Button 1") , gbc);
        gbc.gridx = 2;
        add(new Button("Button 2") , gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(new Button("Button 3") , gbc);
        gbc.gridx = 1;
        add(new Button("Button 4") , gbc);
        gbc.gridx = 2;
        add(new Button("Button 5") , gbc);
        gbc.gridx = 3;
        add(new Button("Button 6") , gbc);
        gbc.gridwidth = 3;
        gbc.gridy = 2;
        gbc.gridx = 0;
        add(new Button("Button 7") , gbc);
        gbc.gridy = 3;
        add(new Button("Button 8") , gbc);
        gbc.gridheight = 2;
        gbc.gridx = 3;
        gbc.gridy = 2;
        add(new Button("Button 9") , gbc);
    }
    public static void main(String[] args) {
        new pgm17();
    }
}