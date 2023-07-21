import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import  javax.swing.border.EmptyBorder;
public class  DemoCheckbox
{
Frame frame;
Checkbox chk1,chk2,chk3,chk4;
DemoCheckbox()
{
frame= new JFrame("Demo of Checkbox");
chk1=new Checkbox("Tea",true);
chk2= new Checkbox("Coffee");
chk3=new Checkbox(" cold Coffee");
chk4= new Checkbox("Green Tea");
frame.add(chk1);
frame.add(chk2);
frame.add(chk3);
frame.add(chk4);
frame.setLayout(new FlowLayout());
frame.setSize(100,100);
frame.setVisible(title);
}
public static void main(String args[])
{
new DemoCheckbox();
}
}