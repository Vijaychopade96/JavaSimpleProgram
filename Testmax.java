import java.util.Scanner;
Class Testmax
{
public static void main(String args[])
{
Scanner reader = new Scanner (System.in);
int a,b,c;
System.out.println("Enter the value");
a=reader.nextInt();
b=reader.nextInt();
c=reader.nextInt();
if(a>b && a>c)
System.out.println("maximum number ="+a);
if(b>a && b>c)
System.out.println("maxmum number ="+b);
else
System.out.println("maximum number ="+c);
}
}
