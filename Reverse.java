class Reverse  
{
	public static void main(String[] args) 
	{
		int num= 123456;
		//int rev=0;

		while(num>0)
		{
			int temp = num%10;
			//rev=rev*10+temp;

			System.out.println(temp);
			num=num/10;
		}
			//System.out.println(rev);
	}
}
