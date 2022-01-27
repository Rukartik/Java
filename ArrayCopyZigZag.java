//store a and b array and print that values in c in zig-zag order 
import java.util.Scanner;
public class ArrayCopyZigZag
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

	
		System.out.println("\nEnter the size of the array A:");
		int asize = s.nextInt();
		int a [] = new int[asize]; 
		System.out.println("Enter the values of array A:");
		for (int i=0; i<asize; i++)
		{
			
			a[i] = s.nextInt();
		}
		
		
		System.out.println("\nEnter the size of the array B:");
		int bsize = s.nextInt();
		int b [] = new int[bsize]; 
		System.out.println("Enter the values of array B:");
		for (int i=0; i<bsize; i++)
		{
			
			b[i] = s.nextInt();
		}
		
		int csize = asize + bsize;
		int c [] = new int[csize];
		int a1 = 0;
		int b1 = 0;
		int i =0;

		while (i < csize)
		{
			if (a1 < asize)
			{
				c[i++] = a[a1++];
			}

			if (b1 < bsize)
			{
				c[i++] = b[b1++];
			}
		}
		
		System.out.println("\nThe values copied in c in zig-zag order are as follows:");
		for (int j=0; j<csize; j++)
		{
			System.out.println(c[j]);
		}
	}
}