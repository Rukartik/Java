//store values in array and print the sum of unique num and discard duplicates 
import java.util.Scanner;
public class ArrayPrintUniqueNum
{
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the size of the array:");
		int asize = s.nextInt();
		int a [] = new int[asize]; 
		System.out.println("Enter the values of array:");
		for (int i=0; i<asize; i++)
		{
			
			a[i] = s.nextInt();
		}
		
		int sum=0;
		for (int i=0; i<asize; i++)
		{
			int flag=0;

			for (int j=i+1; j<asize; j++)
			{
				if (a[i] == a[j])
				{
					flag = 1;
					a[j] = 0;
				}
			}
			if (flag == 0)
			{
				sum = sum + a[i];
			}
		}

		System.out.println("The sum of uqiniqe values present in array: "+sum);
	}
}

		