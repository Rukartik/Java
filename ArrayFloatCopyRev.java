//create an array and store 5 float values and copy same array in new array and print in reverse order
import java.util.Scanner;
public class ArrayFloatCopyRev
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a = s.nextInt();
		float b [] = new float[a];
		for(int i=0; i<a; i++)
		{
			System.out.println("Enter the "+ i +" th index value");
			b[i]=s.nextFloat();
		}
		float c [] = new float[a];
		int n = a-1;
		for (int i=0; i<a; i++)
		{
			c[n--] = b[i];
		}
		System.out.println("\nThe value is reverse order are:");
		for (int i=0; i<a; i++)
		{
			System.out.println(c[i]);
		}
	}
}