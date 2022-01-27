//Fact of all even digit in reverse order of all given num 
import java.util.*;
class FactEvenRev
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int n1 = reverse(n);
		
		while(n1>0)
		{
			int digit = n1%10;
			if (digit%2==0)
			{
				System.out.println(digit + "Factriol" + fact(digit));
			}
			
			n1 = n1/10;
		}
	}
		public static int fact(int n)
		{
			int fact=1;
			for(int i=1; i<=n; i++)
			{
				fact=fact*i;
			}
			return fact;
		}
	
		public static int reverse(int n)
		{
			int rev = 0;
			while(n>0)
			{
				int temp = n%10;
				rev=rev*10+temp;
				n=n/10;
			}
			return rev;
		}
	
}
		