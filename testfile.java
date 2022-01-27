import java.util.Scanner;
class testfile 
{
	public static void main(String[] args) 
	{
		String a, b = "";
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("Enter the  String to be checked");
		 a=s.nextLine();

		int n=a.length();
		for(int i = n - 1; i >= 0; i--)
		{
			b = b + a.charAt(i);
		}
		if (a.equalsIgnoreCase(b))
		{
			System.out.println("The string is palidrome");
		}
		else
		{

			System.out.println("The string is not palidrome");
		}
	}
}
