class Pen
{
		String brand;
		String color;
		double price;


	public static void main(String[] args) 
	{
		Pen p1 = new Pen();
		
		
		p1.brand = "Cello";
		p1.color = "Black";
		p1.price = 50.00;

		

		System.out.println("Details of pen is followed:");

		System.out.println("brand : "+p1.brand);
		System.out.println("color : "+p1.color);
		System.out.println("price : "+p1.price);	

	}
}
