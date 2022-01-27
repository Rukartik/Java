import java.util.Scanner;
class ifStatement
{
	public static void lucky(int num)
	{
		if(num%5==0)
			System.out.println("LUCKY");
	}
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the number to check weather it is lucky or not");
		int num  = s1.nextInt();
		lucky(num);
	
	}
}