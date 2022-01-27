//Check prime/not for given range
import java.util.Scanner;
class PrimeRange
{
	public static void main(String[] args) 
	{

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the from number:");
		int num=s1.nextInt();
		System.out.println("Enter the to number:");
		int num1=s1.nextInt();
		System.out.println("Displaying the prime number from the given range:");

		
		for(int i=num; i<=num1; i++)
		{
			boolean b = false;
			for(int j=2; j<i; j++)
			{
				if (i%j==0)
				{
					b=true;
					break;
				}
			}
			if (b==false)
			{
				System.out.println(i+ ":Is prime\n");
			}
			else
			{
				System.out.println(i+ ":Is not prime\n");
			}

		}

	}
}

