//Methods Shadow With Diffrent Name

class A
{
	public static void demo()
	{
		System.out.println("A");
	}
}

class B extends A
{
	public static void demo1()
	{
		System.out.println("B");
	}
}

class C extends B
{
	public static void demo2()
	{
		System.out.println("C");
	}
}

class driver001122
{
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.demo();

		A a2 = new B();
		a2.demo();
		//a2.demo1();

		A a3 = new C();
		a3.demo();
		//a3.demo1();
		//a3.demo2();

		//B b1 = new A(); CCE

		B b2 = new B();
		b2.demo();
		b2.demo1();

		B b3 = new C();
		b3.demo();
		b3.demo1();
		//b3.demo2();

		//C c1 = new A();
		//C c2 = new B();

		C c3 = new C();
		c3.demo();
		c3.demo1();
		c3.demo2();
	}


}