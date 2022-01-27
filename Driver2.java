class A
{
	int a;
	int b;
	public  void display()
	{
		System.out.println("HELLO FROM A");
	}
}

class B extends A
{
	int a=35;
	int b= 45;
}

class Driver2
{
	public static void main (String[] args)
	{
		B b1 = new B();

		b1.display();
		//System.out.println(b1.c);
		//System.out.println(b1.d);

		System.out.println(b1.a);
		System.out.println(b1.b);
	}
}

	