//WAJP to find the factorial off all digit in given number.

class FactAll
{
	public static void main(String[] args)
	{
		int num = 123;
		int temp = 0;
		
		while(num>0)
		{
			temp=num%10;
			int fact = 1;

		for(int i=1; i<=temp; i++)
		{
			fact=fact*i;
		}
		System.out.println(temp+ "Factorial is:" +fact);
		num=num/10;
		}
	}
}
		