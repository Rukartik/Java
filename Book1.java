class Book1
{
	String bookTitle;
	double price;

	public void getBookDetails()
	{
		System.out.println(bookTitle);
		System.out.println(price);

	}
}

class Bag extends Book1
{
	String color="Blue";
	double price=1200.00;
	Book1 b1;

	public void storeBook()
	{
		//this.b1 = b1;
		System.out.println("Book details has been stored");
		System.out.println("Color:" +color);
		System.out.println("Price:" +price);

	}

	public void removeBook()
	{
		//this.b1 = null;
		System.out.println("Book has been removed");
	}

}

class Driver0
{
	public static void main(String[] args)
	{
		Bag a1 = new Bag();

		a1.storeBook();
		a1.removeBook();

		a1.getBookDetails();

		//a1.storeBook();
	}
}



