class StaticMethod1
{
	public static void Static()
	{
		System.out.println("Hello World!");
	}
	static void demo()
	{
		System.out.println("!!!!!!!!");
	}
}

class Driver
{
	public static void main(String[] args)
	{
		//Static(); CTE cnt access method directly by its name whn it is in diff class. 
		//demo(); CTE cnt access method directly by its name whn it is in diff class. 

		System.out.println(StaticMethod1.demo); // CTE 
	}




}
