



interface DCInterface
{
	static final int a = 100;

	 void demo()
	{
		System.out.println(a);
	}
}

interface DCClass
{
	public static void temp()
	{
		System.out.println("HEllO");
	}
}




class driver implements DCinterface, DCClass
{
	public static void main(String[] args)
	{
		System.out.println(a);
	}
}
