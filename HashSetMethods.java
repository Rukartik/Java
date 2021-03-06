import java.util.*;
class HashSetMethods
{
	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("Sonu Monu");
		hs.add(80.00);
		hs.add(30000.0);
		System.out.println(hs);
		System.out.println("=================================");

		HashSet hs1 = new HashSet();
		hs1.add(20);
		hs1.add("Basu Banana");
		hs1.add("Basu Banana");
		hs1.add(40.00);
		hs1.add(50000.0);
		hs1.addAll(hs);
		System.out.println(hs1);
		System.out.println("=================================");
		
		System.out.println("Before removing elements");
		System.out.println(hs1);
		System.out.println("=================================");
		
		System.out.println("After removing elements");
		Object o = 20;
		System.out.println(hs1.remove(o));
		System.out.println();
		System.out.println(hs1);

		System.out.println("After removing all the elements");
		System.out.println(hs1.removeAll(hs));
		System.out.println("=================================");
		System.out.println(hs1);

		System.out.println("After retaining all the elements");
		System.out.println(hs1.retainAll(hs1));
		System.out.println("=================================");
		System.out.println(hs1);


	}
}