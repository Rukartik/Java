//Strong Number 
class StrongNum
{
	public static void main(String[] args)
	{
		int num=146;
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
			System.out.println(+num1+ " : Is a strong number");
		}

		else System.out.println(+num1+ " : Is not a strong number");
	}
}

class SRN
{
	public static void main(String[] args)
	{
		for (int num=20; num<=50; num++)
		{
			num1 = num;
			int sum=0;
			while (num1>0)
			{
				int temp = num1%10;
				sum=sum+fact(temp);

			}
		}
	}
}