//Prime number / not
import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the vale number");
		int num=s1.nextInt();

		int j=0;
		
		for(int i=2; i<num; i++)
		{
			if (num%i==0)
			{
				System.out.println("It is not a prime number");
				break;
			}
			else 
			{
				j=2;
			}
		}
			if (j==2)
			{
				System.out.println("It is prime number");
			}
	}
}

