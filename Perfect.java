//Perfect number
class  Perfect 
{
	public static void main(String[] args) 
	{
		int num = 10;
		int sum = 0;
		for(int i=1;i<num;i++)
		{
			if (num%i==0)
			{
				sum=sum+1;
			}
		}
		//System.out.println(sum);
		if (sum==num)
		{
			System.out.println("Its is perfect number");
		}
		else 
		{
			System.out.println("Its is not perfect number");
		}
	}
	
}
