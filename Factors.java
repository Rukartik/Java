//WAJP to print factors of given number 
class Factors 
{
	public static void main(String[] args) 
	{
		int num = 6;
		int ce = 0;
		int co = 0;
		
		for (int i=1;i<=num ; i++)
		{
			if (num%i==0)
			{
				if (i%2==0)//Even Factors
				{
					System.out.println(i);
					ce++;
				}
				else
				{
					co++;
				}
				
				//System.out.println(i);
			}
		}
		System.out.println("Count of even" +ce+ "\nCount of odd" +co);
	}
}
