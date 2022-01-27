class A
{
	int a;
	int b;

	public static void demo()
	{
		System.out.println("Hello!");
	}

	public void temp()
	{
		System.out.println("Good Morning");
	}
}

class B extends A
{
	int c;
	int d;

	public static void demo1()
	{
		System.out.println("Hiiii!");
	}

	public void temp1()
	{
		System.out.println("Good Afternoon");
	}

}

class Driver_instanceof
{
	public static void main(String[] args)
	{
		B b = new B();
		A a = new A();

		if (a instanceof A)
		{
			A a1 = a; //true 
		}

		/*if (a instanceof B)
		{
			B b1 = a; //cte 

			//B b1 = (B) a; // cts but cce
		}*/

		if (b instanceof B)
		{
			B b2 = b; //true 
		}

		/*if (B instanceof A)
		{
			A a2 = b; //cte

			//A a2 = (A) c; //cts but cce
		}*/
	}
}
