/*
Pros:
Lazy initialization is possible.
It is also thread safe.
Performance reduced because of synchronized keyword is overcome.

Cons:
First time, it can affect performance.
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
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}