//addAll()
import java.util.*;
class AddMethodAll
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
			a.add(10);
			a.add(20);
			a.add(30);
			a.add(40);

		//System.out.println(a);

		ArrayList a1 = new ArrayList();
			a1.add(500000);
			a1.add("kartik");
			a1.add(30.00);
			
			a1.add(100);
			a1.addAll(a);
		
		System.out.println(a1);
	}
}
