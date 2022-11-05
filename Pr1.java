package TP;
import java.awt.*;
public class Pr1  extends Frame
{
    Pr1()
    {
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("Checkbox 1" , true , cbg);
        cb1.setBounds(50 , 30, 80, 50);
        Checkbox cb2 = new Checkbox("Checkbox 2" , cbg , false);
        cb2.setBounds(50 , 30, 80, 50);
        Checkbox cb3 = new Checkbox("Checkbox 3" , false , cbg);
        cb3.setBounds(50 , 30, 80, 50);

    }
    public static void main(String[] args) 
    {
        new Pr1();
    }
}
