class ArmStrong 
{
	public static void main(String[] args) 
	{
		int num=153;
		int num1=num;
		count=count(num);
		int sum=0;
		while (num>0)
		{
			int temp=num%10;
			sum+=power(temp,count);
			num=num/10;
		}
		if(sum==num1)
		{
			System.out.println(+num+ "Is AmrStrong Number");
		}
		else
		{
			System.out.println(+num+ "Is Not AmrStrong Number");
		}
	}

		public static int count(int num)
		{
			int count=0;
			while (num>0)
			{
				num=num/10;
				count++;
			}
			return count;
		}

		public static int power(int temp int count)
		{
			int power=1;
			for(i=1;i<=count;i++)
			{
				power=power*temp;
			}
		}
	
}
