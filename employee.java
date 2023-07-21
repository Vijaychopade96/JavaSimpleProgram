class Employee
{
int id;
String name;
public  void setData(int id,String name)
{
this.id=id;
this.name=name;
}
public void displayData()
{
System.out.println("Employee ID:"+this.id);
System.out.println("Employee Name:"+this.name);
}
}
class  main
{
public static void main(String args[])
{
Employee[] emp= new Employee[2];
emp[0].setData(1,"Amar");
emp[1].setData(2,"Akbar");
emp[0].displayData();
emp[1].displayData();
}
}