class parent1234
{
	int a;
	int b;
	parent1234(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
}
	class child extends parent1234
	{
		int c;
		child()
		{
			super(10,20);
		}


	public static void main(String[] args) 
	{
		child c1 = new child();
		System.out.println(c1.a);
		System.out.println(c1.b);

	}
}
