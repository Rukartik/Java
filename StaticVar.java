class StaticVar
{
	static int c=30;
	public static void main(String[] args)
	{
		System.out.println(c);
		System.out.println(d);
		System.out.println(StaticVar.c);
		System.out.println(StaticVar.d);
	}
	static 
	{
		
	}
	static int d=40;

}