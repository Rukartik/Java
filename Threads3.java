//By Extending Thread class
/*class Driver
{
	public static void main(String[] args) 
	{
		Threads3 t = new Threads3("Thread-0");
		t.start();
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getPriority());
	}
}

class Threads3 extends Thread
{
	Threads3(String s)
	{
		super(s);
	}

	public void run()
	{
		System.out.println("bhag MILKHA bhagggg...");
	}

}*/



//By implementing Runnable interface
/*class Driver
{
	public static void main(String[] args) 
	{
		Thread t = new Thread(new Threads3("Thread 0"));
		t.start();
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getPriority());
	}
}

class Threads3 extends Thread
{
	Threads3(String s)
	{
		super(s);
	}

	public void run()
	{
		System.out.println("bhag MILKHA bhagggg...");
	}

}*/





class Threads3 extends Thread
{
	Threads3()
	{
		
	}

	public void run()
	{
		System.out.println("bhag MILKHA bhagggg...");
	}

}

class Threads4 implements Runnable
{
	Threads4() 
	{
		
	}
	public void run()
	{
		System.out.println("Basanti in kutto k samne mat nachnaa...");
	}
}

class Driver
{
	public static void main(String[] args) 
	{
		Thread t = new Thread(new Threads4());
		Threads3 t1 = new Threads3();

		System.out.println(t.getName());
		t.start();

		System.out.println(t1.getName());
		t1.start();	
	}
}

