import java.util.Scanner;
class hotelMenu
{
	public static void main(String[] args) 
	{
		System.out.println("1. Dosa ");
		System.out.println("2. Set Dosa ");
		System.out.println("3. Plain Dosa ");
		System.out.println("4. Masala Dosa ");
		System.out.println("5. Idly ");
		System.out.println("6. Vada");

		System.out.println("\n Select the options ");
		
		Scanner s1 = new Scanner(System.in);

		int options = s1.nextInt();

		switch(options)
		{
			case 1:
			{
				System.out.println("\n Succefully Recived Your Order.\n Your Dosa is on the way!");
			}
			break;

			case 2:
			{
				System.out.println("Succefully Recived Your Order.\n Your Set Dosa is on the way!");
			}
			break;

			case 3:
			{
				System.out.println("Succefully Recived Your Order.\n Your Plain Dosa is on the way!");
			}
			break;

			case 4:
			{
				System.out.println("Succefully Recived Your Order.\n Your Masala Dosa is on the way!");
			}
			break;
			
			case 5:
			{
				System.out.println("Succefully Recived Your Order.\n Your Idly is on the way!");
			}
			break;

			case 6:
			{
				System.out.println("Succefully Recived Your Order.\n Your Vada is on the way!");
			}
			break;

			default :
			{
				System.out.println("Enter the valid options");
			}
			

		}
	}
}


	

