// Sum of even & odd int values present in array
import java.util.Scanner;
public class ArraySumOfEO
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int a []  = new int[size];
		for (int i=0; i<size; i++)
		{
			System.out.println("Enter the "+(i+1)+" elements of value");
			a[i] = s.nextInt();
		}
		
		int se=0;
		int so=0;

		for(int i=0; i<size; i++)
		{
			if (a[i]%2==0)
			{
				se = se+a[i];
			}
			else
				so = so+a[i];
		}
		System.out.println("Sum of even no:" +se);
		System.out.println("Sum of odd no:" +so);
	}
}