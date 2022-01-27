import java.util.Scanner;
class TimeTable
{
	public static void subjects(int choice)
	{
		switch(choice)
		{
			case 4 :
			case 1 : System.out.println("Study Kannada");
			break;

			case 6 :
			case 2 : System.out.println("Study English");
			break;

			case 5 :
			case 3 : System.out.println("Study Hindi");
			break;

			case 7 : System.out.println("Hoilday");
		}
	}

}
