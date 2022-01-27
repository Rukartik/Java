class Method
{
	int a=20;
	static int b=40;

	public void demo()
	{
		System.out.println("Demo");
	}

	public void demo1()
	{
		System.out.println("Demo1");
	}

	public static void temp()
	{
		System.out.println("Temp()");
	}

	public static void main(String[] args)
	{
		Method m = new Method();

		System.out.println(b);
		//System.out.println(a); //non-static variable a cannot be referenced from a static context

		//demo(); //CTE we cant access the non-staitc method directly by its name.
		//demo1(); //CTE  we cant access the non-staitc method directly by its name.
		temp();

		m.demo();
		m.demo1();
		m.temp();
	}
}