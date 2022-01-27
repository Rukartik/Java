class A 
{
	public void demo() 
	{
		System.out.println("Hello World!");
	}
}

interface B
{
	public void demo();
}

class C extends A implements B
{
	public static void main(String[] args)
	{
		A a = new A(); //CTS //Hello World
		a.demo();

		C c = new C(); //CTS //Hello World
		c.demo();

		B b = new C(); //CTS //Hello World
		b.demo();

		//B b = new A(); // incompatible types: A cannot be converted to B
		//b.demo();

		//A a = new B(); // B is abstract cannot be instantiated
		//a.demo();



	
	}
}