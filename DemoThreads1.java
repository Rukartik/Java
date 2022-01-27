class DemoThreads1 extends Thread
{
	DemoThreads1()
	{
	}

	public void run()
	{
		System.out.println("Thread is Executing");
	
		try
		{
			Thread.sleep(3000);	
		}
		catch (Exception e)
		{
			System.out.println("Exception Handling");
		}
		System.out.println("Thread is Executed");
	}
}

class DemoThreads2 implements Runnable
{
	DemoThreads2() 
	{
		
	}
	public void run()
	{
		System.out.println("Runnable Thread is Executing");
	
		try
		{
			Thread.sleep(3000);	
		}
		catch (Exception e)
		{
			System.out.println("Exception Handling for Runnable");
		}
		System.out.println("Runnable Thread is Executed");
	}
}

class Driver
{
	public static void main(String[] args) 
	{
		Thread t2 = new Thread(new DemoThreads2());
		DemoThreads1 t1 = new DemoThreads1();

		System.out.println(t1.getName());
		t1.start();
			
		System.out.println(t2.getName());
		t2.start();
		
	}
}
