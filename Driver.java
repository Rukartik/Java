class A
{
	int a=25;
	int b=50;
	public static void display()
	{
		System.out.println("HELLO FROM A");
	}
}

class B extends A
{
	int c=35;
	int d= 45;
}

class Driver1
{
	public static void main (String[] args)
	{
		B b1 = new B();

		A.display();
		System.out.println(b1.c);
		System.out.println(b1.d);
	}
}

	