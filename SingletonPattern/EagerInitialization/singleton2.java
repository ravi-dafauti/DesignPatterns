/*
Pros:
Very simple to implement.
No need to implement getInstance() method. Instance can be accessed directly.
Exceptions can be handled in static block.

Cons:
May lead to resource wastage. Because instance of class is created always, whether it is required or not.
CPU time is also wasted in creation of instance if it is not required.
 */
public class Singleton
{
	public static Singleton instance;
	
	private Singleton()
	{
	}
	static
	{
		instance=new Singleton();
	}
}