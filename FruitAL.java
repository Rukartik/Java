import java.util.*;
class FruitAL
{
	public static void main(String[] args)
	{
		Scanner S = new Scanner(System.in);
		ArrayList a = new ArrayList();

		System.out.println("Enter any 2 fruits names of your choice: ");

		String a1 = S.next().trim();
		a.add(a1);
		
		String b1 = S.next().trim();
		a.add(b1);
		

		System.out.println("Enter the fruit to check");

		Object o = S.next();

		if (a.contains(o))
		{
			System.out.println("Fruit is present");
		}
		else
			System.out.println("Fruit is not present");

	}
}
