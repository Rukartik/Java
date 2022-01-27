import java.util.Scanner;
class ifElseLargest
{
	public static void largest(int a,int b,int c)
	{
		if(a>b && a>c) 
			{
            System.out.println("a is largest");
			} 
			else if (b>c) 
				{
				System.out.println("b is the largest");
				} 
				else 
					{
					System.out.println("c is largest");
					}
    }

		public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
	
		System.out.println("Enter the vale of a");
		int a=s1.nextInt();

		System.out.println("Enter the vale of b");
		int b=s1.nextInt();

		System.out.println("Enter the vale of c");
		int c=s1.nextInt();
		largest(a,b,c);
	}
}
	