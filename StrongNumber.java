//Strong Number 
class StrongNumber
{
	public static void main(String[] args)
	{
		int num=145;
		//int num=146;//Not a strong number
		int num1=num;
		int sum=0;
		while (num>0)
		{
			int temp=num%10;
			int fact=1;
			for(int i=1;i<=temp;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if (sum==num1)
		{
			System.out.println(+num1+ ":Is a strong number");
		}

		else System.out.println(+num1+ ":Is not a strong number");
	}
}