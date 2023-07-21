import java.awt.*;
class myframe extends frame
{
myFrame(String s)
{
super(s);
setVisible(true);
setSize(500,300);
Label one =new Lable("Lable one");
Lable two =new Lable("Lable two");
Lable three =new Lable("Lable three);

setLayout(new FlowLayout());
add(one);
add(two);
add(three);
}
public static void main(String args[])
{
myFrame f=new myFarme("demonstarting farme");
}
}
