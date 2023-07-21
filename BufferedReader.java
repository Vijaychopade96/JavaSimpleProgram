import java.io.*;
public class BufferedReader
{
public static void main(String args[])
{
BufferedReader= br= new BufferedReader(new InputStreamReader(System.io));
String name="";
System.out.println("Enter data:");
name=br.readline();
System.out.println("data is:"+name);
}
}