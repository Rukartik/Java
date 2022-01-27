class MyTesting  
{
	static int a = 10;
	int b=20;
	static int c;

	{
		System.out.println("This is non-static block");
	}

	public static void temp()
	{
		int a = 100;
		System.out.println("This is static temp method");
	}

	public void temp1()
	{
		System.out.println("This is non-static temp1 method");
	}
	
	static
	{
		int c = 40;
		System.out.println("This is static block");	
	}

	public static void main(String[] args) 
	{
		MyTesting mt = new MyTesting();

		System.out.println(MyTesting.a);
		System.out.println(temp().a);
		

		MyTesting.temp();
		mt.temp1();

		System.out.println(mt.b);

		System.out.println(MyTesting.c);

	}
}
