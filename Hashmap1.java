import java.util.*;
class  Hashmap1
{
	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> hm = new HashMap();
		//TreeMap<Integer, Integer> hm = new TreeMap();
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(0, 30);
		hm.put(null, null);
		//hm.put(null, 44);	 //we cant give a null key in tree map	but we can give values as null		

		System.out.println(hm);


		//only values
		Collection c = hm.values();
		System.out.println(c);

		//only keys
		Set s = hm.keySet();
		System.out.println(s);

	}
	
}
