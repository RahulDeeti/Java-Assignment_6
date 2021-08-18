//Assignment 6
//Program 3
public class Test
{
	public Test(String str)
	{
		System.out.println(str);
	}
	public static void main(String args[])
	{
		//We are creating objec by invoking constructor.
		Test t = new Test("Hi!!");
		//Creating array of object references don't create objects
		Test[] arr = new Test[3];
	}
}