//Single level inheritrance
class parent 
{
	int num = 100;
	String name = "PUMA";
	{
		System.out.println("Displaying Parent Class");
	}
}

class child extends parent
{
	int a = 200;
	{
		System.out.println("Displaying Child Class");
	}
}

class Driver789
{
	public static void main (String[] args)
	{
		child c = new child();

		System.out.println(c.a);
		System.out.println(c.num);
		System.out.println(c.name);
	
	}
}