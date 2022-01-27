//create an array and store 5 float values and copy same array in new array and print the values of even index first and odd.
import java.util.Scanner;
public class ArrayFloatCopyEORev
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a = s.nextInt();
		float na [] = new float[a];
		float b [] = new float[a];
		for(int i=0; i<a; i++)
		{
			System.out.println("Enter the "+ i +" th index value");
			b[i]=s.nextFloat();
		}
		int n = 0;
		for(int i=0;i<b.length; i++)
		{
			if ((i+1)%2==0)
			{
				na[n++]=b[i];
			}
		}

		for (int i=0; i<b.length; i++)
		{
			if ((i+1)%2!=0)
			{
				na[n++]=b[i];
			}
		}
		System.out.println("The reverse order of values (index) starts from even and then odd"); 
		for (int i=0; i<b.length; i++)
		{
			System.out.println(na[i]);
		}
	}
}