public class break
{
public static void main(String args[])
{
int num=7;
int flag=0;
for(int i=2;i<num-1;i++)
{
int(num% i==0)
{
flag=1;
break;
}
else
{
flag=0;
}
}
if(flag==0)
System.out.println(num +"is prime");
else
{
System.out.println(num +"is not prime");
}
}