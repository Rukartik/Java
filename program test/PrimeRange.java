//Check prime/not for given range
import java.util.Scanner;
class PrimeRange
{
	public static void main(String[] args) 
	{

		/*Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the from number:");
		int num=s1.nextInt();
		System.out.println("Enter the to number:");
		int num1=s1.nextInt();
		System.out.println("Displaying the prime number from the given range:");*/

		
		//for(int i=num; i<num1; i++)

		for(int i=20; i<=50; i++) //range 20 to 50 
		{
			int flag=0;
			
			for(int j=2; j<i; j++)
			{
				if (i%j==0)
				{
					flag=1;
					break;
				}
			}
			if (flag==0)
			{
				System.out.println(i);
			}
			

		}

	}
}

