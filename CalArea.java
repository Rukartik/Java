import java.util.Scanner;
class CalArea 
{
	public static double areaOfCircle(double r)
	{
		return 3.14*r*r;
	}
	public static int areaOfRectangle(int l, int b)
	{
		return l*b;
	}
	public static void main(String[] args) 
	{
		//int r=5, l=10 ,b=13;	
		Scanner s1 = new Scanner(System.in);

		System.out.println("The area of the radius of circle");
		int r=s1.nextInt();
		System.out.println("The area of the circle is: "+areaOfCircle(r));

		System.out.println("Eneter the length");
		int l=s1.nextInt();
		System.out.println("Enter the breadth");
		int  b=s1.nextInt();
		
		System.out.println("The area of retangle is: "+areaOfRectangle(l,b));
	
	}
}
