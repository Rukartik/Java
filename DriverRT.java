class A
{
	public String test()
	{
		System.out.println("VERSION 1.0");
		return "Hello";
	}
}

class B extends A
{
	public String test()
	{
		System.out.println("VERSION 2.0");
		return "Hiii!";
	}
}

class C extends B
{
	public String test()
	{
		System.out.println("BETA VERION");
		return "HWR?????";
	}
}

class DriverRT
{
	public static void main(String[] args)
	{
		A a = new A();
		a.test(); //A

		A a1 = new B();
		a1.test(); //B

		B b = (B)  a1;
		b.test();

		//A a2 = new C();
		//a2.test(); //C

		System.out.println("*==========*==========*");

		//B b = (B) new A();
		//b.test(); //CTE cannot be converted & If we do explicit downcasting will get CCE

		

		B b1 = new B();
		b1.test(); //B

		B b2 = new C();
		b2.test(); //C

		System.out.println("*==========*==========*");

		//C c = new C();
		//c.test(); //CTE cannot be converted & If we do explicit downcasting will get CCE

		//C c2 = new C();
		//c2.test(); //CTE cannot be converted & If we do explicit downcasting will get CCE

		C c3 = new C();
		c3.test(); //C
	}

}