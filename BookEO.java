//Equals object method 
class BookEO
{
	String bname;
	BookEO(String bname)
	{
		this.bname=bname;
	}

	/*public static void main(String[] args)
	{
		BookEO b1 = new BookEO("JAVA");
		BookEO b2 = b1;

		System.out.println(b1.bname);
		System.out.println(b2.bname);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}*/




	public static void main(String[] args)
	{
		BookEO b1 = new BookEO("JAVA");
		BookEO b2 = new BookEO("JAVA");

		System.out.println(b1.bname);
		System.out.println(b2.bname);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}
}