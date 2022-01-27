//variable shadow 
class A 
{
	int a=10;
	int b=20;
}

class B extends A
{
	int a=30;
	int b=40;
}

class C extends B
{
	int a=50;
	int b=60;
}

class driver0011223344
{
	public staitc void main(String[] args)
	{
		A a1 = new A();
		System.out.println(a1.a);
		System.out.println(a1.b);

		A a2 = new B();
		System.out.println(a2.a);
		System.out.println(a2.b);

		A a3 = new C();
		System.out.println(a3.a);
		System.out.println(a3.b);

		/*B b1 = (B) new A();
		System.out.println(b1.a);
		System.out.println(b1.b);*/

		B b2 = new B();
		System.out.println(b2.a);
		System.out.println(b2.b);







}