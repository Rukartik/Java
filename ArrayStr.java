//String read and store from user 
import java.util.Scanner;
public class ArrayStr
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		String a[] = new String[size];
		for (int  i =0; i<size; i++)
		{
			System.out.println("Enter the " +(i+1)+ "st element value");
			a[i] = s.next();
			
		}
		System.out.println("\nThe values stored in arrays are:");
		for (int  i=0; i<size; i++)
		{
			
			System.out.println(a[i]);
		}
	}

}