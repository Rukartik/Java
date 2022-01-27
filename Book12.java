package Book12;
import java.util.*;
class Book12
{
	int id;
	int price;
	String name;

	Book12(int a, int b, String c)
	{
		id = a;
		price = b;
		name = c;
	}

	public void display()
	{
		System.out.println("Book id is :" +id);
		System.out.println("Book price is :" +price);
		System.out.println("Book name is :" +name);
	}
}

class Driver 
{
	public static void main(String[] args)
	{
		ArrayList<Book12> b12 = new ArrayList<Book12>();
		b12.add(new Book12(1, 200, "eegfadwgw"));
		b12.add(new Book12(2, 300, "eyrthrth"));
		b12.add(new Book12(3, 400, "lisdge"));
	
	for(Book12 b1 : b12)
	{
		b1.display();
		System.out.println("===============================");
	}
	}
}
	
