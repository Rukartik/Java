class parent
{
	public void demo()
	{
		System.out.println("PARENT METHOD");
	}
}

class child extends parent
{
	public void demo()
	{
		System.out.println("CHILD METHOD");
	}

}

class MethodOveriding
{
	public static void main(String[] args)
	{
		parent p1 = new parent();
		p1.demo();

		parent p2 = new parent();
		p2.demo();

		child c1 = new child();
		c1.demo();

		child c = new child();
		c.demo();
	}

}
