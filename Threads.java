import java.util.*;
class Threads 
{
	public static void main(String[] args) throws  InterruptedException
	{
		String name = Thread.currentThread().getName();
		System.out.println("The name of the thread is : " +name);
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().isAlive());
		//System.out.println(Thread.currentThread().interrupt());

		for (int i=0; i<5; i++)
		{
			System.out.print(i);
			//Thread.sleep(3000);
			
		}
	}
}
