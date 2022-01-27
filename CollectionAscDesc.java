//inbuuilt ASC & DESC methods in collections
import java.util.*;
class  CollectionAscDesc
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(5);
		a.add(50);
		a.add(15);

		System.out.println("Before sorting");
		System.out.println(a);

		System.out.println();
		Collections.sort(a);
		System.out.println("After sorting");
		System.out.println(a);

		System.out.println();
		Collections.reverse(a);
		System.out.println("After Desc");
		System.out.println(a);
	}
}
