//laptop over toString method && override equals method
class LaptopOC
{
	int ram;
	int rom;
	int processor_speed;

	LaptopOC(int ram, int rom, int processor_speed)
	{
		this.ram=ram;
		this.rom=rom;
		this.processor_speed=processor_speed;
	}
	@Override
	
	public String toString()
	{
		return "ram size:" +ram;
		return "rom size:" +rom;
		return "processor_speed size:" +processor_speed;
	}

	public boolean equals(Object o)
	{
		Laptop l = (Laptop) o;
		if (this.ram == l.ram)
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		LaptopOC l1 = new LaptopOC(10, 200, 7);
		LaptopOC l2=l1;
		LaptopOC l3 = new LaptopOC(15, 300, 5);
		LaptopOC l4 = new LaptopOC(10, 200, 7);
		LaptopOC l5=l4;

		System.out.println(l1);
		System.out.println(l1.equals(l3));
		System.out.println(l1==l2);
		System.out.println(l3);
		System.out.println(l1==l4);
		System.out.println(l1.equals(l4));
	}

}

