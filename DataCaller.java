import java.util.Scanner;
class DataCaller 
{
		public static int add(int a, int b)
		{
			int res=a+b;
			return res;
		}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the vale of a");
		int a=s1.nextInt();
		System.out.println("Enter the vale of b");
		int b=s1.nextInt();
		System.out.println("The addtion value of a & b is:");
		System.out.println(add(a,b));
	}

}
