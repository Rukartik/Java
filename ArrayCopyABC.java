//store a and b array and print that both values in c
import java.util.Scanner;
public class ArrayCopyABC
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

	
		System.out.println("Enter the size of the array A:");
		int asize = s.nextInt();
		int a [] = new int[asize]; 
		System.out.println("Enter the values of array A:");
		for (int i=0; i<asize; i++)
		{
			
			a[i] = s.nextInt();
		}
		
		
		System.out.println("Enter the size of the array B:");
		int bsize = s.nextInt();
		int b [] = new int[bsize]; 
		System.out.println("Enter the values of array B:");
		for (int i=0; i<bsize; i++)
		{
			
			b[i] = s.nextInt();
		}
		
		int csize = asize + bsize;
		int c [] = new int[csize]; 
		int j=0;
		for (int i=0; i<csize; i++)
		{
			if (i<asize)
			{
				c[i] = a[i];
			}
			else
				c[i] = b[j++];
		}
		System.out.println("The value stored in array c is:");
		for (int i=0; i<csize; i++)
		{
			System.out.println(c[i]);
		}
	}
}
		