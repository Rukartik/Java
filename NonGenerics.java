package generics;
import java.util.ArrayList;
public class NonGenerics
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		int sum = 0;

		for (Object o : l)
		{
			int a = (Integer)o;
			sum = sum+a;
		}
		System.out.println(sum);
	}
}