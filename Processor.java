//Session 16
class Processor
{
	int speed;
	String genration;
	
	public void displayAttributes()
	{
		System.out.println("Speed :" +speed);
		System.out.println("Genration :" +genration);
	}
}

class Laptop 
{
	String brand;
	double mrp;

	Processor p = new Processor();

	public void displayAttributes()
	{
		System.out.println("Brand :" +brand);
		System.out.println("MRP :" +mrp);
	}
}

class Driver111
{
	public static void main(String[] args)
	{
		Laptop l = new Laptop();
		l.displayAttributes();
		l.p.displayAttributes();
	}
		
}
