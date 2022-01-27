//Strong Number Range
class StrongNumberRange
{
	public static void main(String[] args)
	{
		//int num=145;
		//int num=146;//Not a strong number
		int num1=1;
		int num2=500;
		int sum=0;

		for(int i=num1; i<=num2; i++)
		{
			for(int j=2; j<i; j++)
			{
				while (num1>0)
				{
					int temp=num1%10;
					int fact=1;
					for(int k=num1;k<=num2;k++)
					{
						fact=fact*i;
					}
					sum=sum+fact;
					num1=num2/10;
				}
			}
		}
		if (sum==num1)
		{
			System.out.println(+num1+ ":Is a strong number");
		}

		else System.out.println(+num1+ ":Is not a strong number");
	}
}