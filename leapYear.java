import java.util.Scanner;
class leapYear
{
	public static void leap(int a)
	{
		if((a%4==0 && a%100 !=0) || (a%400==0))
		{
			System.out.println("This is the leap year");
		}
		else
		{
			System.out.println("This is not a leap year");
		}

	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the year");
		int a = s1.nextInt();

		leap(a);
	}
}
