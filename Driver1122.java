class Parent 
{
	int p=100;
}

class Child extends Parent
{
	int c = 200;
}
class Driver1122
{
	public static void main(String[] args) 
	{
		Child c1 = new Child();

		System.out.println(c1.p+" " +c1.c);

		Parent p1 = new Child();
		System.out.println(p1.p);

		//System.out.println(p1.c);


	}
}
