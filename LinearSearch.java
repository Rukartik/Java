//search the element in given array using linear search
import java.util.Scanner;
class  LinearSearch
{
	public static void main(String[] args) 
	{
		int n,m,flag=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ther size of the array");
		n=s.nextInt();
		int a [] = new int [n];

		System.out.println("\nEnter the element to store in array:");
		for (int i=0; i<n; i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("Enter the element to search: ");
		m = s.nextInt();
		for (int i=0; i<n; i++ )
		{
			if (a[i] == m)
			{
				
				flag = 1;
				break;
				
			}
			else
				flag = 0;
		}
		
		if (flag == 1)
		{
			System.out.println("Element found");
		}
		else 
			System.out.println("Element not found");

	}
}
