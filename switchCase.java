import java.util.Scanner;
class switchCase
{
	public static void main(String[] args) 
	{
		System.out.println("1. Addtion ");
		System.out.println("2. Subtraction ");
		System.out.println("3. Multiplication ");
		System.out.println("4. Division ");
		System.out.println("\n Select the operation ");
		
		Scanner s1 = new Scanner(System.in);

		int operation = s1.nextInt();

		if(!(operation<1 && operation>4))
			{
				System.out.println("Enter the valid operation");
			}
		else
			{
				System.out.println("Enter two integer to perform opration");
			
		int a = s1.nextInt();
		int b = s1.nextInt();

		switch(operation)
		{
			case 1:
			{
				System.out.println("Addition of two number is" +(a+b));
			}
			break;

			case 2:
			{
				System.out.println("Subtraction of two number is" +(a-b));
			}
			break;

			case 3:
			{
				System.out.println("Multiplication of two number is" +(a*b));
			}
			break;

			case 4:
			{
				System.out.println("Division of two number is" +(a/b));
			}
			break;

			default :
			{
				System.out.println("Enter the valid operation");
			}
		}
			}

	}
}


	

