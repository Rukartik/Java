//
import java.util.*;
class Sentance 
{
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the  sentence of your own:");

		String senc = s.nextLine();
		HashSet hs = new HashSet();

		for (int i=0;i<senc.length(); i++)
		{
				hs.add(senc.charAt(i));
		}
		System.out.println("The duplicate char has been removed and length of present sentence is: " +hs.size());
		System.out.println(hs);
	}
}
