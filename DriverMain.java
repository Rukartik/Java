//session 16 

class Sim  
{
	private int simno;
	String serviceprovider;

	public int getsimno()
	{
		return simno;
	}
	public void getSimDetails(int simno, String serviceprovider)
	{
		System.out.println(simno);
		System.out.println(serviceprovider);
	}

	Sim()
	{

	}

	Sim(int simno, String servivceprovider)
	{
		this.simno = simno;
		this.serviceprovider = serviceprovider;
	}
}

class Mobile
{
	String model;
	int price;

	Sim s;

	public void getMobileDetails()
	{
		System.out.println(model);
		System.out.println(price);
	}

	public void insertSim(Sim s)
	{
		this.s = s;
		System.out.println("Sim is inserted");
	}


	public void removeSim()
	{
		this.s = null;
		System.out.println("Sim is removed");
	}

	Mobile(String model, int price)
	{
		this.model = model;
		this.price = price;
	}
}

class DriverMain
{
	public static void main(String[] args)
	{
		Mobile m1 = new Mobile("Black berry",10000);

		m1.insertSim(new Sim());
		m1.getMobileDetails();
		m1.s.getSimDetails(123,"JIO");

		m1.removeSim();
	}



}

	
