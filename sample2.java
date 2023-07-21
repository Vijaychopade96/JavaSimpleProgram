class sample2
{
string name;
int age;
static int count;
void accept (String n,int a)
{
name=n;
age=a;
}
void show()
{
count++;
System.out.println("count="+count);
}
void display()
{
System.out.println("Name="+name);
System.out.println("Age="+age);
}
public static void main(String args[])
{
Sample2 s1=new Sample2();
Sample2 s2=new Sample2();
s1.accept("abc",10);
s1.display();
s1.show();
s2.accept("xyz",20);
s2.display();
s2.show();
}
}