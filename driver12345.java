//Variables shadow
class parent
{
	static int a=100;
	 int b=200;
}

class child extends parent 
{
	static int c=300;
	static int d=400;
}

class driver12345
{
	public static void main(String[] args)
	{
		parent p1 = new parent();
		System.out.println(p1.a);
		System.out.println(p1.b);

		/*parent p2 = new child();
		p2.demo();

		child c1 = new child();
		c1.demo();

		child c2 = (child) new parent();
		c2.demo(); */
	}
}