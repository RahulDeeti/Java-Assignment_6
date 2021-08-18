//Assignment 6
//Program 4
public class TestUpdated
{
	public TestUpdated(String str)
	{
		System.out.println(str);
	}
	public static void main(String args[])
	{
		TestUpdated t = new TestUpdated("Hi!!");
		
		//we are creating array of object references
		//We are also initializing objects using constructor
		TestUpdated[] arr = new TestUpdated[3];
		arr[0] = new TestUpdated("How are you?");
		arr[1] = new TestUpdated("I'm fine");
		arr[2] = new TestUpdated("How about you?");
	}
}