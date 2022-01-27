class Digits 
{
	public static void main(String[] args) 
	{
		int num;
		for(num=123;num>0;)
		{
			int temp = num%10;
			System.out.println(temp);
			num=num/10;
		}
	}
}
