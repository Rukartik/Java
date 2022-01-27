//WAJP for each fact in a given num
class fact10 
{
	public static void main(String[] args) 
	{
		int num = 123;
		int fact=1;

		while (num>0)
		{
			int temp = num%10;
			//if (temp%2==0)

			
			for(int i=temp; i>=1; i--)
			{
				fact=fact*i;
				System.out.println(fact);
			}
			
			num=num/10;
		}
		
	}
}
