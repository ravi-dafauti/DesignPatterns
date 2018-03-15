/*
When the singleton class is loaded, inner class is not loaded and hence doesn’t create object when loading the class.
Inner class is created only when getInstance() method is called. So it may seem like eager initialization but it is lazy initialization.
This is the most widely used approach as it doesn’t use synchronization.

This is Best Approach
 */
public class Singleton
{
    private Singleton()
    {
    }
    private class Inner
    {
        private static final Singleton INSTANCE=new Singleton();
    }
    public static Singleton getInstance()
    {
        return Inner.INSTANCE;
    }
}