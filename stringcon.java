//WAJP to concat fname and lname (trim & uppercase)
import java.util.Scanner;
class stringcon
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
			
		System.out.println("Enter the first name");
		String fname = s.nextLine().trim().toUpperCase();
		
		System.out.println("Enter the last name");
		String lname = s.nextLine().trim().toUpperCase();

	
		System.out.println(fname.concat(" "+lname));


	}
}