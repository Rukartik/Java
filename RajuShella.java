import java.util.*;
class RajuShella
{
	public static void main(String[] args)
	{
		Scanner S = new Scanner(System.in);
		ArrayList Raju = new ArrayList();
		ArrayList Sheela = new ArrayList();

		Raju.add("math");
		Raju.add("geo");
		Raju.add("eng");
		Sheela.add("math");
		Sheela.add("geo");
		Sheela.add("hindi");

		System.out.println(Raju);

		System.out.println(Sheela);

		Sheela.removeAll(Raju);
		System.out.println();
		System.out.println("Remaining books with Shella are:");
		System.out.println(Sheela);
		

	}
}