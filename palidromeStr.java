import java.util.Scanner;
class paildromeStr 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String a1 = " " ;
		String b = " ";

		System.out.println("Enter the  String to be checked");
		int a1=s.nextLine();

		int n=a.length();
		for(int i=n-1; i>0; i--)
		{
			b = b + a.charAt(i);
		}

		if (a1.equalsIgnoreCase(b))
		{
			System.out.println("The string is palidrome");
		}
		else
		{

			System.out.println("The string is not palidrome");
		}
	}
}
