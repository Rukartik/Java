class parentCTE
{
	int a;
	int b;
	parentCTE()
	{

	}

	parentCTE(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
}
class child extends parentCTE
{
	int c;
	public static void main(String[] args)
	{
		child c1 = new child();
		System.out.println(c1.a);
	}
}