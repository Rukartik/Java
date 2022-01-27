//Method Overloading (STATIC & NON-STATIC)
class A 
{
	public static void add() 
	{
		System.out.println("add()");
	}

	public void add(int a) 
	{
		System.out.println("add() int a");
	}
}

class B extends A
{
	public static void add(int a, float b) 
	{
		System.out.println("add() (int & float");
	}

	public void add(int a, int b) 
	{
		System.out.println("add() (int a & int b)");
	}
}

class Driver3210
{
	public static void main(String[] args)
	{
		A a1 = new A();
		A.add();
		a1.add(10);
		
		//A.add(10f,10);
		a1.add('A');

		B b1 = new B();
		B.add(10,22f);
		b1.add(10,20);
		
		b1.add(50);

		
	}
}