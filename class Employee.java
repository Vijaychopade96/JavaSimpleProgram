class Employee
{
	int id;
	String name;
	public void setData(int id,Sring name)
	{
     this.id=id;
     this.name=name;

	}
	public void displayData()
	{
		System.out.println("Employee ID:"+this.id);
		System.out.println("Employee name:"+this.name);

	}
}
class main
{
	public static void main(String args[])
	{
		Employee[] emp=new Employee[2];
		emp[0].setData(1,"amar");
		emp[1].setData(2,"akbar");
		emp[0].displayData();
		emp[1].displayData();
	}
}