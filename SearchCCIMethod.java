//search contains() containsAll() indexOf()
import java.util.*;
class SearchCCIMethod
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
			
			System.out.println(a1);

			Object a2=40;

			System.out.println("\nWhat is the indedx element of 40?" +a1.indexOf(a2));
			
			System.out.println("\nDoes a conatins element 20?" +a1.contains(a));
			
			System.out.println("Does a1 contains the elements os a?" +a1.containsAll(a));
			System.out.println(a1);

			a1.clear(); //clears the whole list. clear()


			System.out.println(a1);
	}
}