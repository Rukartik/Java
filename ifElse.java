import java.util.Scanner;
class ifElse 
{
	public static void alphaNumSpl(char ch)
	{
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )
			{
				System.out.println("It is an alaphabet");

			} 
		else if(ch >= '0' && ch <= '9')
			{
				System.out.println("It is an number");
			}
		else
			{
				System.out.println("It is a special character");
			}
	}

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);

		System.out.println("\nPlease Enter the character: ");
		char ch = s1.next().charAt(0);
		alphaNumSpl(ch);
	
	}
}
