//Assignment-6
//Overloaded constructors program
public class OverloadedConstructors
{
	public OverloadedConstructors()
	{	
		this("Hello, ");
		System.out.print("World!!");
	}
	public OverloadedConstructors(String str)
	{
		System.out.print(str);
	}
	public static void main(String args[])
	{
		//Overloaded constructors print Hello, World!!
		OverloadedConstructors obj = new OverloadedConstructors();
	}
}