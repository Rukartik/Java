
class parent
{
	static int a=100;
	 int b=200;
}

class child extends parent 
{
	static int a=300;
	static int b=400;
}

class driver123456
{
	public static void main(String[] args)
	{
		parent p1 = new parent();
		System.out.println(p1.a);
		System.out.println(p1.b);

		parent p2 = new child();
		System.out.println("\n" +p2.a);
		System.out.println(p2.b);


		child c1 = new child();
		System.out.println("\n" +c1.a);
		System.out.println(c1.b);


		child c2 = (child) new parent();
		System.out.println("\n" +c2.a);
		System.out.println(c2.b);
 
	}
}