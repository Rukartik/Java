import java.util.Scanner;
class stringBuffer
{
	public static void main(String[] args)
	{

	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String");
	String name = s.nextLine().trim();

	StringBuffer b = new StringBuffer(name); //string to string buffer
	System.out.println("Converted from String to StringBuffer: " +b);

	String a = new String(b); ///string buffer to string
	System.out.println("Converted from StringBuffer to String: "+a);
	}

}