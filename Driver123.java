class parent
{
	int num = 40;
	String name;
	{
		System.out.println("Non-Satic");
	}
}
class child extends parent
{
	int a = 36;
	{
		System.out.println("Non-Staic child");
	}
}
class Driver123
{
	public static void main(String[] args)
	{
		child c = new child();
		System.out.println(c.a);
		System.out.println(c.num);
		System.out.println(c.name);
	}

}