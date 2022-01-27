//Method Overloading (STATIC)
class A 
{
	public static void add() 
	{
		System.out.println("add()");
	}

	public static void add(int a) 
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

	public static void add(int a, int b) 
	{
		System.out.println("add() (int a & int b)");
	}
}

class Driver10
{
	public static void main(String[] args)
	{
		A.add();
		A.add(10);
		
		//A.add(10f,10);
		A.add('A');

		B.add(10,20);

		
	}
}