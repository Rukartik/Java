/*interface DemoInterface
{
	static final int a = 100;

	static void demo()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		//System.out.println("The value of a is:" +a);
		//System.out.println("The value of a is:" +DemoInterface.a);
		demo();
	}
	
}*/






/*interface DemoInterface
{
	static final int a = 100;
	public static void main(String[] args)
	{
		System.out.println("The value of a is:" +a);
	}

}
class demo implements DemoInterface
{
}*/



abstract interface DemoInterface
{
	static final int a = 100;

	static void demo()
	{
		System.out.println(a);
	}
}
class demo implements DemoInterface
{
	public static void main(String[] args)
	{
		System.out.println(a);
	}
}







