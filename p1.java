//Given num is palidrome or not
class P1
{
	public static void main(String[] args) 
	{
		int num= 1220;
		int num1=num;
		int rev=0;

		while(num>0)
		{
			int temp = num%10;
			rev=rev*10+temp;

			//System.out.println(temp);
			num=num/10;
		}
			if(rev==num1)
			{
				System.out.println("No is palidrome");
			}
			else
		{
				System.out.println("No is Not palidrome");
		}
			
	}
}
