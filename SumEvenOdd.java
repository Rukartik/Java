//Summation of even and odd num
class SumEvenOdd 
{
	public static void main(String[] args) 
	{
		int num = 456;
		int se = 0;
		int so = 0;

		while (num>0)
		{
			int temp = num%10;
			if (temp%2==0)
			{
				se = se+temp;
			}
			else
			{
				so = so+temp;
			}
			num = num/10;
		}
			System.out.println("Sum of even no:" +se);
			System.out.println("Sum of odd no:" +so);
	}
}
