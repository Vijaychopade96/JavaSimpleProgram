import javax.swing.*;
public class JOptionPaneExample
{
	JFrame jframe;
	JOptionPaneExample()
	{

     jframe=new JFrame();
	JOptionPane.showMessageDialog(jframe, "Welcome Java World...");
}
public static void main(String args[])
{
	new JOptionPaneExample();
}
}