//
import java.util.*;
class IntSortAsec
{
	public static void main(String[] args) 
	{
		
		Scanner S = new Scanner(System.in);
		HashSet a = new HashSet();

		System.out.println("Enter the 5 intege values of your choice:");

		int a1 = S.nextInt();
		int b1 = S.nextInt();
		int c1 = S.nextInt();
		int d1 = S.nextInt();
		int e1 = S.nextInt();

		a.add(a1);
		a.add(b1);
		a.add(c1);
		a.add(d1);
		a.add(e1);
		System.out.println("The duplicates values has been removed:");
		System.out.println(a);

		TreeSet b = new TreeSet();
		b.addAll(a);
		System.out.println("============================");
		System.out.println("Sorted values are:");
		System.out.println(b);

		



	}
}
