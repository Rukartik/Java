//Perfect number
class  PerfectNumber
{
	public static void main(String[] args) 
	{
		for (int j=1; j<100; j++)
		{
			int sumfact = 0;
			for (int i=1; i<j; i++)
			{
				if (j%i==0)
				{
					sumfact=sumfact+i;
				}
			}
			if (sumfact==j)
			{
				System.out.println(j + " is a perfect number");
			}
		}
	}
}
