//int read and store from user
import java.util.Scanner;
public class Array1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int a[] = new int[size];
		for (int i =0; i<size; i++)
		{
			System.out.println("Enter the " +(i+1)+ "st element value");
			a[i] = s.nextInt();
			
		}

		for (int i=0; i<size; i++)
		{
			
			System.out.println(a[i]);
		}
	}

}