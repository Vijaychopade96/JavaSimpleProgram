import java.util.Scanner;
public class Exdessort
{
public static void main(String rags[])
{
int n,temp;
Scanner sc=new Scanner(System.in)
System.out.println("Enter the limit:");
n=sc.nextInt();
int[] array=new int[10];
System.out.println("Enter the element of the array:");
for(int i=0;i<n;i++)
{
array [i]=sc.nextInt();
}
System.out.println("Array element are: ");
for(int i=0;i<n;i++)
{
System.out.println("" +array[i]);
}
for(int i=0;i<n;i++)
{
for|(int j=i+1;j<n;j++)
{
if(array[i]<array[j])
{
temp=array[i];
array[i] =array[j];
array[j]=temp;
}
}
}