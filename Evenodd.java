import java.util.Scanner;
class Evenodd
{
public static void main(String args[])
{
Scanner reader= new Scanner(System.io);
System.out.println("Enter a number:");
int year=reader.nextInt();
if((year %4==0) && (year %100!=0)) ||(year%400 ==0))
System.out.println(year+"is laep year");
else
System.out.println("year +"is NOT Leap year");
}
}