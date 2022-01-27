import java.util.*;
class  UsingTreeSet
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet();
		t.add("Roots");
		t.add("Stem");
		t.add("Branch");
		t.add("Leaves");
		t.remove("Fruits");
		System.out.println("Elements in the tree are : " +t);
	}
}
