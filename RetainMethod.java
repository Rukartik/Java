//retain()
import java.util.*;
class RetainMethod 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
			a.add(10);
			a.add(20);
			a.add(30);
			a.add(40);


			ArrayList a1 = new ArrayList();
			a1.add(60);
			a1.add(70);
			a1.add(80);
			a1.addAll(a);

			System.out.println("\nBeforing retain the element");
			System.out.println(a1);
			System.out.println("\nAfter retain the element");
			System.out.println(a1.retainAll(a));
			System.out.println();
			System.out.println(a1);

			a1.clear(); //clears the whole list. clear()


			System.out.println(a1);
	}
}