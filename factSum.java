class factSum
{
	public static void main(String[] args) 
	{
		int num=456;
		int sum=0;
		while(num>0)
		{
			int temp=num%10;
			if (temp%2==0)
			{
				sum=sum+temp;

			}
			num=num/10;
		}
		System.out.println(sum);
	}
}
