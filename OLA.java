//OLA Aggregetion
import java.util.Scanner
class Hompage
{
	String pickup;
	String destination;
}

class Auto extends Homepage 
{
	double costpkm = 150;
}

class Mini extends Homepage
{
	double costpkm = 300;
}

class Prime extends Homepage
{
	double costpkm = 450;
}

class OLA
{
	String name;
	int Cno;
	
	Homepage h1;

	public void bookRide(Hmepage h1)
	{
		this.h1 = h1;
	}
	public void cancelRide() 
	{
		this = null;
	}
	public void currentRide()
	{
		if (h1 instanceof Auto)
		{
			Auto a1 = (Auto) h1;
			System.out.println("You're Auto is on the way" +a1.costpkm);
		}
		else if (h1 instanceof Mini)
		{
			Mini m1 = (Mini) h1;
			System.out.println("You're Mini is on the way" +m1.costpkm);
		}
		else (h1 instanceof Prime)
		{
			Prime p1 = (Prime) h1;
			System.out.println("You're Prime iis on the way" +costpkm);
		}
	}


}

class driver778899
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		OLA o = new OLA();
		
		int a = s.nextInt();




