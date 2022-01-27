//Basketball & Tennisball
import java.util.Scanner;
class Ball 
{
	private double radius;

	public double getRadius()
	{
		System.out.println("Radius :" +radius);
		return;

	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}
}

class Basketball extends Ball
{
	String game="Basketball";
}
class Tennisball extends Ball  
{
	String game="Tenissball";
}

class Bag 
{
		Ball b;

		Bag b1 = new Bag();

		public void addBall(Ball b)
		{
			this.b = b;
			System.out.println("Ball is added in Bag");
		}

		public void removeBall()
		{
			b = null;
			System.out.println("Ball has been removed from the Bag");
		}

		public void isBagEmpty()
		{
			if(b == null)
				System.out.println("The Bag is Empty");
			else
				System.out.println("The Bag is not Empty");
		}

		public void showGame()
		{
			if(ball instanceof Basketball)
			{
				Basketball b = (Basketball)ball;
				System.out.print("You can play" +b.game+ " game");
			}
			else
			{
				Tennisball b = (Tennisball)ball;
				System.out.println("You can play" +b.game+ " game");
			}
		}

}

class DriverBall
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Bag b = new Bag();
		boolean flag = true;

		do
		{
			System.out.println("*==========*==========*==========*==========*");
			System.out.println("1. Add Ball");
			System.out.println("2. Remove Ball");
			System.out.println("3. Check Ball is Empty or Not");
			System.out.println("4. Show Game That Can Be Played");
			System.out.println("5. Exit");

			System.out.println("Please Select The Choice");
			System.out.println("*==========*==========*==========*==========*");

			int a = s.nextInt();

			switch(a)
			{
				case 1:
				{
					System.out.println("1. Basketball");
					System.out.println("2. Tennisball");
					System.out.println("Please Select Your Choice");
					int b = nextInt();

					switch (b)
					{
					case 1 : 
						{
							bag.addBall(new Basketball());
							System.out.println("Basketball is Sucessfully Added");
						}
						break;
					case 2 :
						{
							bag.addBall(new Tennisball());
							System.out.println("Tennisball is Sucessfully Added");
						}
					}
					break;
				}

				case 2 :
					{
						bag.removeBall();
						System.out.println("Ball is sucessfully removed from the bag");
					}
					break;
				
				case 3 : bag.isBagEmpty();
						break;
				
				case 4 : bag.showGame();
						break;

				case 5 : flag = false;
				}
			}while (flag);
		}
	}
