class Find
{
	int a;
	static String name;

	static 
	{
		System.out.println("Static");
	}

	int c =40;
	{
		c=c*a;
		System.out.println(c);
	}
	static
	{
		Find f = new Find();
		f.a=20;
		f.name="rama";
	}

	{
		System.out.println(a);
		System.out.println(name);
		c=test();
	}
	

	public static int test()
	{
		System.out.println("test()");
		return 40;
	}
	
	{
		a=c+50;
		c=a+10;
		System.out.println(a);
		System.out.println(c);
		System.out.println(name);
	}

	public static void main(String[] args)
	{
		Find f = new Find();
		System.out.println(f.a);

		Find f1 = new Find();
		System.out.println(f.c);
		System.out.println(test());
	}
}