import java.util.*;
class Neon 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int square = num * num;
		while (square > 0)
		{
			int digit = square % 10;
			sum = sum + digit;

			square = square/10;
		}

		if (sum == num)
		{
			System.out.println("Neon number");
		}
		else
			System.out.println("Not Neon number");
	}
}
