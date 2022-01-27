package generics1;
import java.util.ArrayList;
public class Generics1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		int sum = 0;

		for (Integer i : l)
		{
			sum = sum+i;
		}
		System.out.println(sum);
	}
}