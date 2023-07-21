import java.util.Scanner;
class system
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter an integer:");
int number=input.nextInt();
System.out.println("Number using nextInt():"+number);
input.close();
}
}