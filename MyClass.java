import java.util.*;
class  MyClass
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet();
		t.add("one");
		t.add("two");
		t.add("three");
		t.add("four");
		t.add("five");

		Iterator i = t.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next() + " ");
		}

		
	}
}
