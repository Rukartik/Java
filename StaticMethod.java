class StaticMethod 
{
	public static void Static()
	{
		System.out.println("Hello World!");
	}
	static void demo()
	{
		System.out.println("!!!!!!!!");
	}


	public static void main(String[] args) 
	{
		Static();
		demo();
		StaticMethod.Static();
		StaticMethod.demo();
		StaticMethod  d = new StaticMethod ();
		d.Static();
		d.demo();
	}
}
