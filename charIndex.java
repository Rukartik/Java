import java.util.Scanner;
class  charIndex
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");

		String name=s.nextLine().trim();

		for(int i=0; i<(name.length()); i++)
		{
			if(i>1 && (i<((name.length())-2)))
			{
				System.out.print("*");
			}
			else
				System.out.print(name.charAt(i));
		}
	}
}
