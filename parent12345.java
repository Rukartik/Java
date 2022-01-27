class parent12345 
{
	int a=20;
	int b=30;
}

class child extends parent12345
{
	int a=40;
	int b=50;

	

	public static void main(String[] args)
	{
		parent12345 p = new parent12345();
		System.out.println(p.a);
		System.out.println(p.b);

		

		child c = new child();

		System.out.println(c.a);
		System.out.println(c.b);

		
		//System.out.println(super.a);
		//System.out.println(super.b);


		
	}



}
	