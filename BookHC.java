class BookHC
{
	String bname;
	int baba;
	
	BookHC(String bnanme)
	{
		this.bname=bname;
	}

	public int hashCode()
	{
		return baba;
	}

	public static void main(String[] args)
	{
		/*BookHC b1 = new BookHC("JAVA");
		BookHC b2 = b1;

		System.out.println(b1.bname);
		System.out.println(b2.bname);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));

		int h1 = b1.hashCode();
		int h2 = b2.hashCode();
		System.out.println(h1==h2);*/



		BookHC b1 = new BookHC("JAVA");
		BookHC b2 = new BookHC("JAVA");

		System.out.println(b1.bname);
		System.out.println(b2.bname);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));

		int h1 = b1.hashCode();
		int h2 = b2.hashCode();
		System.out.println(h1==h2);

		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());


	}

}