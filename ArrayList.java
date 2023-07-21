import java.util.*;
import java.io.*;
class  ArrayList{
public static void main(String args[])
int n;
BufferReader br=new BufferReader(newInputstreamReader(System.in));
System.out.println("Enter Size of ArrayList:");

n=Integer.PareInt(br.readLine());

ArrayList<String>a=new ArrayList<String>(n);
for(int i=0;i<=n;i++)
System.out.println("Enter City name:");
{

a.add(br.readLine());
}
br.clear();
System.out.println(br);
}
}