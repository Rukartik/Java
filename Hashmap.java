import java.util.*;
class  Hashmap
{
	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		hm.put(1, 10);
		hm.put('b', "Hello");
		hm.put('c', 30);
		hm.put(null, null);
		hm.put(3, null);

		System.out.println(hm);

		//only keys
		Set s = hm.keySet();
		System.out.println(s);

		//only values
		Collection c = hm.values();
		System.out.println(c);

	}
	
}
