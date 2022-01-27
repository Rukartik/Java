class NonStatic
{
	int a;
	int b =20;

	static 
	{
		int c=20;
	}

	public static void demo()
	{
		int d=20;
	}

	public static void main(String[] args)
	{
		//System.out.println(a);

		NonStatic s = new NonStatic();
		System.out.println(s.a);
		System.out.println(s.b);
		//System.out.pritnln(s.c);
		//System.out.pritnln(s.d);
		s.demo();
	}

}
