//search element in arrray using binary search
import java.util.*;
class BinarySearch
{
	public static void main(String[] args) 
	{
		int n,m;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ther size of the array");
		n=s.nextInt();
		int a [] = new int [n];

		System.out.println("\nEnter the element to store in array:");
		for (int i=0; i<n; i++)
		{
			a[i] = s.nextInt();
		}

		int low = 0;
		int high = a.length-1;
		int mid = low + high/2;
		int flag =0;
		
		Arrays.sort(a);

		System.out.println("Enter the element to search: ");
		m = s.nextInt();

		while (high >= low)
		{
			mid = (low + high)/2;

			if (m == a[mid])
			{
				flag =1;
				break;
			}

			else if (m > a[mid])
			{
				low = mid+1;
			}
		
			else
			{
				high = mid-1;
			}
		}
		if (flag == 1)
		{
			System.out.println("Key is found at index value: " +(mid));
		}
		else
			System.out.println("Key is not found");
	}
}