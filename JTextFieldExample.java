import javax.swing.*;
class JTextFieldExample
{
	public static void main(String args[])
	{
		JFrame jframe=new JFrame("JTextField Example");
		JTextField jtextfield1,jtextfield2;
		jtextfield1= new JTextField("Welcome to the java");
		jtextfield1.setBounds(50,100,200,30);
		jtextfield2=new JTextField("Welcome to the Swing");
		jtextfield2.setBounds(50,150,200,30);
		jframe.add(jtextfield1);
		jframe.add(jtextfield2);
		jframe.setSize(400,400);
		jframe.setLayout(null);
		jframe.setVisible(true);			
	}
}											