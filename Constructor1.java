class Constructor1 
{
	String title;
	double price;
	String author;
	
	{
		System.out.println("\n Goligat \n");
	}
	public void display()
	{
		System.out.println(title );
		//System.out.println(price  );
		System.out.println(author  );
	}

	Constructor1()
	{
		System.out.println("No Argument Constructor \n");
	}

	public static void main(String[] args) 
	{
		Constructor1 c1 = new Constructor1();
		c1.title = "Hari Patil";
		//c1.price = 2520;
		c1.author = "\nSuraj Bhau Chavan";
		c1.display();
		System.out.println("\nBookit Tengul");
	}
}
