//Overriding equals(Object o)
class Book
{
	String bname;
	Book(String bname)
	{
		this.bname = bname;
	}
	@Override

	public boolean equals(Object o)
	{
		Book b = (Book)o;
		if (this.bname == b.bname)
			return true;
		else 
			return false;
	}

	/*public static void main(String[] args)
	{
		Book b1 = new Book("JAVA");
		Book b2 = b1;

		System.out.println(b1.bname);
		System.out.println(b2.bname);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));

	}*/




	public static void main(String[] args)
	{
		Book b1 = new Book("JAVA");
		Book b2 = new Book("JAVA");

		System.out.println(b1.bname);
		System.out.println(b2.bname);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));

	}
		
}