// Hierarchical inheritrance
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
	//int a = 200;
	{
		System.out.println("Displaying Child Class");
	}
}

class gchild extends parent 
{
	//int b = 300;
	{
		System.out.println("Displaying Child G-Class");
	}
}

class Driver321
{
	public static void main (String[] args)
	{
		child c = new child();
		System.out.println(c.num);
		System.out.println(c.name);

		gchild gc = new gchild();
		System.out.println(gc.num);
		System.out.println(gc.name); 

	
	}
}