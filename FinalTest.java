class  FinalTest
{
	final int d;
	final static int a;
	static 
	{a=20;}
	FinalTest()
	{
		d=10;
	}
	final static void demo()
	{
		System.out.println("Hello World!");
	}
}

class Driver1 extends FinalTest
{
	public static void main(String[] args)
	{
		
		Driver1 d1 = new Driver1();
		System.out.println(d1.d);
		System.out.println(d1.a);

		FinalTest.demo();
	}
}
