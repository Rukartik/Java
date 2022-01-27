class Laptop
{
		String brand;
		int ram;
		double price;


	public static void main(String[] args) 
	{
		Laptop l1 = new Laptop();
		
		
		l1.brand = "Lenovo";
		l1.ram = 8;
		l1.price = 50000.00;

		

		System.out.println("Details of pen is followed:");

		System.out.println("Brand : "+l1.brand);
		System.out.println("Ram : "+l1.ram);
		System.out.println("Price : "+l1.price);	

	}
}
