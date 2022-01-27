class Demo 
{
	static int a = 10;
	int b = 20;
	static int c;

	public static void temp()
	{
		int c = 30;
		System.out.println("Temp() is an  staitc ()");
	}

	public void temp1()
	{
		System.out.println("Temp1() is an  non-staitc ()");
	}

	{
		System.out.println("Non staitc block");
	}

	static 
	{
		System.out.println("staitc block");
	}

	public staitc void main(String[] args)
	{
		Demo d = new Demo();
		Demo.temp();
		System.out.println(d.b);
		System.out.println(Demo.c);

		System.out.println(d.c);
	}
}