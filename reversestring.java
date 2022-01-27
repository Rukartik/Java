import java.util.Scanner;
 
class reversestr
	{
		public static void main (String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Entere the string to reverse");
			String str =s.nextLine();
			String rstr = " ";
			for (int i=0; i<str.length(); i++)
			{
        
				rstr= ch+rstr; 
			}
      
      System.out.println("Reversed word: "+ rstr);
    }
}