import java.util.*;
class XP 
{
	public static void main(String[] args) 
	{

		int x=0, y=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr the to check: ");
		int num=s.nextInt();
		int temp=num;
		
		while (num>0)
		{
			
			 int digit = num%10;
			 
			if ((num == temp) || (num <= 9))
			{
				x = x + digit;
			}
			else
			{
				y = y + digit;
			}
			num=num/10;
		}

		if (x == y)
		{
			System.out.println("\nThis number  is xylem");
		}
		else
		{
			System.out.println("\nThis number  is phloem");
		}
		
	}
}
