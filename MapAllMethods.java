import java.util.*;
class MapAllMethods 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap();
		hm.put(1, "A for Apple");
		hm.put(2, "B for Baby-Doll");
		hm.put(3, "C for Cat");
		hm.put(4, "D for Dog");
		hm.put(5, "E for Elephant");
		hm.put(6, "F for Frog");
		hm.put(7, "G for God");

		hm.remove(6);

		System.out.println("HashMap Conatins : " +hm);
		System.out.println("\nMap size() : " +hm.size());
		System.out.println("\nMap get() : " +hm.get(1));
		System.out.println("\nMap empty() : " +hm.isEmpty());
		System.out.println("\nMap containValues(G for God) : " +hm.containsValue("G for God"));
		System.out.println("\nMap conatinsKey(6) : " +hm.containsKey(6));
		System.out.println("\nMap entrySet() : " +hm.entrySet());

		//only keys
		Set s = hm.keySet();
		System.out.println("\nKeys used in HashMap : " +s);

		//only values
		Collection c = hm.values();
		System.out.println("\nVales present in HashMap : " +c);

	}
}
