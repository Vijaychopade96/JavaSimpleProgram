 class nestedwhileloop
{
public static void main(String args[])
{
int i=1, j=1;
System.out.println("tables");
while(i<=2)
{
while(j<=10)
{
System.out.println(i+"*"+j+"="+(i*j));
j++;
}
i++;
System.out.println("");
System.out.println("");
}
}
}
