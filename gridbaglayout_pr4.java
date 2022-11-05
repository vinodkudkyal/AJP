import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
public class gridbaglayout_pr4 extends Frame {
    gridbaglayout_pr4() {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setVisible(true);
        setTitle("GriBagLayout In Java");
        setSize(500 , 500);
        setLayout(gbl);
        gbc.gridx = 0 ;
        gbc.gridy = 0 ;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(new Label("Name") , gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new TextField() , gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new Label("Comments") , gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(new TextArea() ,gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 30;
        gbc.fill = GridBagConstraints.VERTICAL;
        add(new Button("Submit") , gbc);
    }
    public static void main(String[] args) {
        new gridbaglayout_pr4();
    }
}