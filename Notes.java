class NoConstructor

{
	String title;
	double price;
	String author;


	/*public static void show() 
	{
		System.out.println(title);
		System.out.println(price);
		System.out.println(author);	
	}*/

public static void main(String[] args)
	{
	NoConstructor n1 = new NoConstructor();
	System.out.println(n1.title);
	System.out.println(n1.price);
	System.out.println(n1.author);

	}
	NoConstructor ()
	{
	System.out.println("NoArgConst");
	}
	 
}

