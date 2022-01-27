import java.util.*;
class CityAL
{
	public static void main(String[] args)
	{
		Scanner S = new Scanner(System.in);
		ArrayList a = new ArrayList();

		System.out.println("Enter any 5 choice names of your choice: ");

		String a1 = S.next().trim();
		String b1 = S.next().trim();
		String c1 = S.next().trim();
		String d1 = S.next().trim();
		String e1 = S.next().trim();

		a.add(a1);
		a.add(b1);
		a.add(c1);
		a.add(d1);
		a.add(e1);
		
		System.out.println("Enter the city to check");

		Object o = S.next();

		if (a.contains(o))
		{
			a.remove(o);
			System.out.println("City has been removed");
			System.out.println(a);
		}
		else
			System.out.println("City is not present");

	}
}