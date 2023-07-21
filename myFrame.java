import java.awt.*;
class myFrame extends Frame
{
	myFrame(String title)
	{
	setVisible(true);
	setSize(100,100);
	setTitle(title);
}
public static void main(String args[])
{
	myFrame f= new myFrame("my Frame");
}
}
