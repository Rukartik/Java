//Multi level inheritrance
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

class gchild extends child 
{
	int b = 300;
	{
		System.out.println("Displaying Child G-Class");
	}
}

class Driver456
{
	public static void main (String[] args)
	{
		gchild gc = new gchild();

		System.out.println(gc.num);

		System.out.println(gc.a); //parent

		System.out.println(gc.b); //gchild
		System.out.println(gc.name); //parent
	
	}
}