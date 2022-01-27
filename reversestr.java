//reverse the given string
import java.util.Scanner;
 
class reversestr
	{
		public static void main (String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the string to reverse");

			String str =s.nextLine().trim();
			String rstr = " "; 
			for (int i=str.length()-1; i>=0; i--)
			{
        
				rstr= rstr+str.charAt(i);
			}
      
      System.out.println("Reversed String is: "+ rstr.trim());
    }
}