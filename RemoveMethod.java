//remove()
import java.util.*;
class RemoveMethod 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
			a.add(10);
			a.add(20);
			a.add(30);
			a.add(40);
			System.out.println("Beforing removing element");
			System.out.println(a);
			System.out.println("\nAfter removing the elements");
			Object a2 = 20;
			System.out.println(a.remove(a2));
			System.out.println();
			System.out.println(a);

			ArrayList a1 = new ArrayList();
			a1.add(60);
			a1.add(70);
			a1.add(80);
			a1.addAll(a);

			System.out.println("\nBeforing removing th element");
			System.out.println(a1);
			System.out.println("\nAfter removing the element");
			System.out.println(a1.removeAll(a1));
			System.out.println();
			System.out.println(a1);
	}
}