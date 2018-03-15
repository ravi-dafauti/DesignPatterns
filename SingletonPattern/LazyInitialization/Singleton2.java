/*
Pros:
Lazy initialization is possible.
It is also thread safe.

Cons:
getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.
 */
public class Singleton
{
	private static Singleton instance;
	
	private Singleton()
	{
	}
	synchronized public static Singleton getInstance()
	{
		if(instance==null)
		{
			instance=new Singleton();
		}
		return instance;
	}
}