//abstract class 
abstract class Cal
{
	abstract public int add(int a, int b);

}

class Addition extends Cal
{
	public int add(int a, int b)
	{
		int s = a+b;
		return s;
	}
}

class demo
{
	public static void main(String[] args)
	{
		Addition a = new Addition();
		System.out.println("The addition of two given number:" +a.add(100,200));
		
	}
}