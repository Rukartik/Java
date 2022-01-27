
class FactSumEvenOdd
{
	public static void main(String[] args)
	{
		fact(1234568);
	}
	
	public static void fact(int n)
	{
		int sumef = 0;
		int sumof = 0;
		
		

		while (n>0)
		{
			int temp = n%10;
			int efact=1;
			int ofact=1;

			if (temp%2==0)
			{
				for (int i=1; i<=temp; i++)
				{
					efact*=i;
					
				}
				sumef+=efact;
			}

			else
			{
				for (int i=1; i<=temp; i++)
				{
					ofact*=i;
					
				}
				sumof+=ofact;
			}
			n=n/10;

			
		}
		System.out.println("The sum of even fact is : "+sumef);
		System.out.println("The sum of even fact is : "+sumof);
	}
		

}