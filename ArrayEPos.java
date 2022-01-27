// Sum of even positions 
import java.util.Scanner;
public class ArrayEPos
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a = s.nextInt();
		int [] b = new int[a];
		for (int i=0; i<a; i++)
		{
			System.out.println("Enter the "+i+" elements of value");
			b[i] = s.nextInt();
		}
		int sum = 0;
		for(int i=0; i<a; i++)
		{
			if((i+1)%2==0)
				System.out.println("The value "+(i+1)+" position is " +b[i]);
		}
	}
}