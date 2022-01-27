package pro;
public class samepro
{
	protected int a = 10;

	protected static void demo()
	{
		System.out.println("Hello Niggas");
	}
}

class main
{
	public static void main(String[] args)
	{
		samepro s = new samepro();
		s.demo();
		System.out.println(s.a);
	}
}