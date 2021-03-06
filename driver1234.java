//Method shadow
class parent
{
	public static void demo()
	{
		System.out.println("parent method");
	}
}

class child extends parent 
{
	public static void demo()
	{
		System.out.println("child method");
	}
}

class driver1234
{
	public static void main(String[] args)
	{
		parent p1 = new parent();
		p1.demo();

		parent p2 = new child();
		p2.demo();

		child c1 = new child();
		c1.demo();

		child c2 = (child) new parent();
		c2.demo();
	}
}