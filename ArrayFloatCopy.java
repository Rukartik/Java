//create an array and store 5 float values and copy same array in new array and print 
import java.util.Scanner;
public class ArrayFloatCopy
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
		for (int i=0; i<a; i++)
		{
			c[i] = b[i];
		}
		System.out.println("The value is copied from one aaray to another are:");
		for(int i=0; i<a; i++)
		{
			System.out.println(c[i]);
		}
	}
}