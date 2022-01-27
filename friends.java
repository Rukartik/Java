import java.util.Scanner;
class friends 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the native of friend A");
		String f1 = s.nextLine();
		
		System.out.println("Enter the native of friend B");
		String f2 = s.nextLine();

		System.out.println(f1.equals(f2)); //it will check the states as well as the upper and lower case. if its same then return true or else fasle.
		System.out.println(f1.equalsIgnoreCase(f2)); //it jus check the states then return true 



		
	}
}
