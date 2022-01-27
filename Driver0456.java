//Method Overloading (NON-STATIC)
class A 
{
	public void add() 
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
	public void add(int a, float b) 
	{
		System.out.println("add() (int & float");
	}

	public void add(int a, int b) 
	{
		System.out.println("add() (int a & int b)");
	}
}

class Driver0456
{
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.add();
		a1.add(10);
		
		//A.add(10f,10);
		a1.add('A');

		B b1 = new B();
		b1.add(10,22f);
		b1.add(10,20);

		
	}
}