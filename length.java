//print length of th eiven string
import java.util.Scanner;
class length
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr the city name:");
		String city = s.nextLine().trim();

		System.out.println(city.length());
	}
}
