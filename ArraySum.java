// Sum of int values present in array
import java.util.Scanner;
public class ArraySum
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a = s.nextInt();
		int [] b = new int[a];
		for (int i=0; i<a; i++)
		{
			System.out.println("Enter the "+(i+1)+" elements of value");
			b[i] = s.nextInt();
		}
		int sum = 0;
		for(int i=0; i<a; i++)
		{
			sum = sum+b[i];
		}
		System.out.println("The sum of values:" +sum);
	}
}