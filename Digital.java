//find the digigtal sum of a number 

import java.util.*;
class Digital 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number to find digital sum: ");
		int num=s.nextInt();
		do
		{
			while(num>0)
			{
				int digit = num%10;
				sum += digit;
				num = num/10;
			}
			num = sum;
			sum = 0;
		}
		while (num > 9);
		System.out.println(num);
	}
}
