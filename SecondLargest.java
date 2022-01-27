import java.util.*;
class SecondLargest 
{
	public static void main(String[] args) 
	{
		
		
		//Scanner s = new Scanner(System.in);
		//System.out.println("\nEnter the values for a, b & c");
		int a=10,b=20,c=30;
		/*int a1= s.nextInt();
		int a2= s.nextInt();
		int a3= s.nextInt();*/
	
		if (a>b && a>c)
		{
			if (b>c)
			{
				System.out.println(b);
			}
			else
				System.out.println(c);
		}

		else if (b>c)
		{
			if (a>c)
			{
				System.out.println(a);
			}
			else
				System.out.println(c);
		}

		else
		{
			if (b>a)
			{
				System.out.println(b);
			}
			else
				System.out.println(a);
		}

	}
}
