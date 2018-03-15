/*
Pros:
Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
Exception handling is also possible in method.

Cons:
Every time a condition of null has to be checked.
instance can’t be accessed directly.
In multithreaded environment, it may break singleton property.
 */
public class Singleton
{
	private static Singleton instance;
	
	private Singleton()
	{
	}
	public static Singleton getInstance()
	{
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
}