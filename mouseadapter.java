import java.awt.*;
import java.awt.event.*;
public class JmouseAdapter extands mouseAdapter
{
	Frame frame;
	JmouseAdapter()

}
{
frame = new Frame("my mouse Adapter");
frame.addmouseListener(this);
frame.setSize(300,300);
frame.setLayout(null);
frame.setVisible(true);
}

public void mouseClicked(mouseEvent me)
{
	Graphics g = frame.getGraphics();
	g.setColor(color.ORANGE);
	g.fillOval(me.getx(),me.gety(),30,30);

}
public static void main(String args[])
{
	new JmouseAdapter();
}