import javax.swing.*;
class JTextFieldExample
{
	public static void main(String args[])
	{
		JFrame jframe=new JFrame("JTextFiled Example");
		JTextFiled jtextfiled1,jtextfiled2;
		jtextfiled1= new JTextFiled("Welcome to the java");
		jtextfiled1.setBounds(50,100,200,30);
		jtextfiled2=new JTextFiled("Welcome to the Swing");
		jtextfiled2.setBounds(50,150,200,30);
		jframe.add(jtextfiled1);
		jframe.add(jtextfiled2);
		jframe.setSize(400,400);
		jframe.setLayout(null);
		jframe.setVisible(true);			
	}
}											