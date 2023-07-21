public class Student
{
	String name="abc";
	int age=20;
	void display()
	{
		System.out.println("my name is:"+name);
		System.out.println("I am "+age+"years old");

	}
	public static void main(String args[])
	{
		Student s=new Student();
		s.display();
	}
}