class Coupon
{
	String classs = "Bussniess";
	String standby = "yes";
	int meal_code = 1010;
	int dor = 1025;

	public void display()
	{
		System.out.println(classs);
		System.out.println(standby);
		System.out.println(meal_code);
		System.out.println(dor);
	}
	
}

class Ticket
{
	long tickting_code = 10251997;
	int number = 012345;

	public void display()
	{
		System.out.println(tickting_code);
		System.out.println(number);
	}

	Coupon c;

	public void addCoupon(Coupon c)
	{
		this.c=c;
	}
}

class Customer
{
	String name = "RAMA";
	int dof = 1025;

	public void display()
	{
		System.out.println(name);
		System.out.println(dof);
	}

	Ticket t = new Ticket();
}

class Driver2510
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer();
		c1.display();

		c1.t.display();

		c1.t.addCoupon(new Coupon());
		System.out.println(c1.t.c.classs);
		c1.t.c.display();
	}
}